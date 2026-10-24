/**
 * Main entry point of our Kotlin application.
 *
 * In Lesson 1 we learned that the JVM searches for a function named 'main'.
 * In Lesson 2 we learned how to capture and validate user input safely against nulls.
 * In Lesson 3 we implemented the interactive main loop with exhaustive control flow.
 * In Lesson 4 we modularized the application using default arguments, named arguments,
 * and single-expression functions.
 * In Lesson 5 we enhance the CLI output using extension functions and infix notation.
 * In Lesson 6 we introduce higher-order functions, lambdas, and sanitization pipelines.
 */

/**
 * Represents the exhaustive set of selectable options in the console main menu.
 */
enum class MenuOption {
    CHAT,
    SETTINGS,
    EXIT,
    UNKNOWN
}

/**
 * Prints a visually bordered banner in the interactive console.
 *
 * Demonstrates default arguments combined with fluent extension functions.
 */
fun printBanner(
    title: String = "AI Chat CLI",
    width: Int = 31,
    borderChar: Char = '='
) {
    val border = borderChar.toString().repeat(width).cyan()
    println(border)
    println("🤖 ${title.bold().cyan()}")
    println(border)
}

/**
 * Prompts the user for their name via standard console input.
 * If the input is null or blank, it falls back to [defaultName].
 */
fun askForUsername(defaultName: String = "Guest"): String {
    print("Please, enter your name: ".cyan())
    val input = readlnOrNull()
    return if (!input.isNullOrBlank()) input.trim() else defaultName
}

/**
 * Maps raw terminal input text to the structured [MenuOption] enum.
 * Using a single-expression function with 'when' provides a declarative mapping.
 */
fun parseMenuOption(raw: String?): MenuOption = when (raw?.trim()) {
    "1" -> MenuOption.CHAT
    "2" -> MenuOption.SETTINGS
    "3" -> MenuOption.EXIT
    else -> MenuOption.UNKNOWN
}

/**
 * Displays available navigation commands in the terminal menu with styled headers.
 */
fun printMenu() {
    println("\n--- Main Menu ---".bold())
    println("1. Chat")
    println("2. Settings")
    println("3. Exit")
    print("Choose an option: ".cyan())
}

/**
 * Executes business logic corresponding to the chosen menu action.
 *
 * Leverages the infix function [taggedWith] and color extensions to present clean statuses.
 *
 * @return true if the main loop should continue running,
 *         false if the user requested to terminate the application.
 */
fun executeMenuOption(option: MenuOption, username: String): Boolean = when (option) {
    MenuOption.CHAT -> {
        print("\n$username: ".cyan())
        val userMessage = readlnOrNull().orEmpty()
        if (userMessage.isNotBlank()) {
            // Apply our custom higher-order censoring function with trailing lambda syntax
            val sanitized = censorWords(userMessage) { word ->
                word in FORBIDDEN_WORDS
            }

            // Also demonstrate myFilter by identifying and reporting any censored words
            val detectedWords = userMessage.split(" ").myFilter { it.lowercase() in FORBIDDEN_WORDS }
            if (detectedWords.isNotEmpty()) {
                println("Moderated words: ${detectedWords.joinToString(", ")}".yellow() taggedWith "FILTER".yellow())
            }

            println("AI: \"$sanitized\"" taggedWith "AI".green())
        } else {
            println("No message provided.".yellow())
        }
        true
    }
    MenuOption.SETTINGS -> {
        println("Entering settings... (Work in progress)" taggedWith "SYSTEM".yellow())
        true
    }
    MenuOption.EXIT -> {
        println("Goodbye, $username! See you soon.".yellow())
        false
    }
    MenuOption.UNKNOWN -> {
        println("Invalid option. Please try again.".red())
        true
    }
}

/**
 * Main interactive entry point for the AI Chat CLI application.
 */
fun main() {
    // 1. Display banner utilizing default parameters and extension styles
    printBanner()

    // 2. Safely capture the validated username
    val username = askForUsername()
    println("\nHello, ${username.bold()}!")

    // 3. Interactive loop governed by our modular function return values
    while (true) {
        printMenu()
        val rawInput = readlnOrNull()
        val option = parseMenuOption(rawInput)

        val shouldContinue = executeMenuOption(option, username)
        if (!shouldContinue) {
            break
        }
    }
}
