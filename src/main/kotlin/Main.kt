/**
 * Main entry point of our Kotlin application.
 *
 * In Lesson 1 we learned that the JVM searches for a function named 'main'.
 * In Lesson 2 we learned how to capture and validate user input safely against nulls.
 * In Lesson 3 we implement the interactive main loop with exhaustive control flow.
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
 * Main interactive entry point for the AI Chat CLI application.
 */
fun main() {
    println("===============================")
    println("🤖 AI Chat CLI")
    println("===============================")

    print("Please, enter your name: ")
    
    // Safely capture user terminal input
    val input: String? = readlnOrNull()

    // Validate input: if non-null and not blank use it; otherwise fallback to "Guest".
    // Pedagogical note: In Lesson 4 we will modularize and clean up this logic with dedicated functions.
    val username: String = if (!input.isNullOrBlank()) input else "Guest"

    println("\nHello, $username!")

    // Main interactive loop that keeps the application alive
    while (true) {
        println("\n--- Main Menu ---")
        println("1. Chat")
        println("2. Settings")
        println("3. Exit")
        print("Choose an option: ")

        val rawOption: String? = readlnOrNull()

        // Use 'when' as a first-class expression to parse raw text (String)
        // into our structured Enum, returning the value directly.
        val selectedOption: MenuOption = when (rawOption) {
            "1" -> MenuOption.CHAT
            "2" -> MenuOption.SETTINGS
            "3" -> MenuOption.EXIT
            else -> MenuOption.UNKNOWN
        }

        // Use 'when' with our Enum. Because it is a closed hierarchy
        // (the compiler knows all possible cases), it enforces exhaustive
        // branch handling without requiring a default 'else'.
        when (selectedOption) {
            MenuOption.CHAT -> {
                println(">>> Entering chat mode... (Work in progress)")
            }
            MenuOption.SETTINGS -> {
                println(">>> Entering settings... (Work in progress)")
            }
            MenuOption.EXIT -> {
                println("Goodbye, $username! See you soon.")
                break // Break out of the while(true) loop and terminate cleanly
            }
            MenuOption.UNKNOWN -> {
                println("Invalid option. Please try again.")
            }
        }
    }
}
