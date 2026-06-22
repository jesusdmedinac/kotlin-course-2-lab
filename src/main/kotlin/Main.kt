/**
 * Punto de entrada principal de nuestra aplicación Kotlin.
 *
 * En la Lección 1 aprendimos que la JVM buscará una función llamada 'main'.
 * En la Lección 2 aprendimos a recibir datos del usuario de forma segura.
 * En la Lección 3 implementaremos un bucle principal y control de flujo exhaustivo.
 */

// Definimos un Enum para representar las opciones de nuestro menú de forma estricta.
enum class MenuOption {
    CHAT,
    SETTINGS,
    EXIT,
    UNKNOWN
}

fun main() {
    println("===============================")
    println("🤖 AI Chat CLI")
    println("===============================")

    print("Please, enter your name: ")
    
    // Capturamos la entrada de forma segura
    val input: String? = readlnOrNull()

    // Validamos usando if-else tradicional
    // Nota: Esto puede simplificarse a if (input.isNullOrBlank()) pero lo refactorizaremos en la Lección 4.
    val username: String
    if (input != null && input.isNotBlank()) {
        username = input
    } else {
        username = "Guest"
    }

    println("\nHello, $username!")

    // Bucle principal (Main Loop) que mantiene viva la aplicación interactiva
    while (true) {
        println("\n--- Main Menu ---")
        println("1. Chat")
        println("2. Settings")
        println("3. Exit")
        print("Choose an option: ")

        val rawOption: String? = readlnOrNull()

        // Usamos 'when' como expresión para mapear el input crudo (String) 
        // a nuestro Enum estructurado, devolviendo el valor directamente.
        val selectedOption: MenuOption = when (rawOption) {
            "1" -> MenuOption.CHAT
            "2" -> MenuOption.SETTINGS
            "3" -> MenuOption.EXIT
            else -> MenuOption.UNKNOWN
        }

        // Usamos 'when' nuevamente, pero esta vez con nuestro Enum. Al ser una jerarquía 
        // cerrada (el compilador conoce todas las opciones), nos obliga a manejar 
        // exhaustivamente todos los casos posibles sin necesidad de un 'else'.
        when (selectedOption) {
            MenuOption.CHAT -> {
                println(">>> Entering chat mode... (Work in progress)")
            }
            MenuOption.SETTINGS -> {
                println(">>> Entering settings... (Work in progress)")
            }
            MenuOption.EXIT -> {
                println("Goodbye, $username! See you soon.")
                break // Rompe el bucle while(true) y finaliza el programa
            }
            MenuOption.UNKNOWN -> {
                println("Invalid option. Please try again.")
            }
        }
    }
}
