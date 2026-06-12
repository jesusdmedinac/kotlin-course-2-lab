/**
 * Punto de entrada principal de nuestra aplicación Kotlin.
 *
 * En la Lección 1 aprendimos que la JVM buscará una función llamada 'main'.
 * En la Lección 2 aprenderemos a recibir datos del usuario de forma segura.
 */
fun main() {
    println("===============================")
    println("🤖 Bienvenido al Chat de IA CLI")
    println("===============================")

    print("Por favor, introduce tu nombre: ")
    
    // readlnOrNull() captura lo que el usuario escribe en la terminal.
    // Devuelve un String nullable (String?) porque la entrada podría fallar o estar vacía de forma inesperada.
    val input: String? = readlnOrNull()

    // Validamos manualmente si la entrada es nula o está en blanco usando un if clásico.
    // Declaramos 'username' usando 'val' (Solo Lectura) porque no la reasignaremos.
    val username: String
    if (input != null && input.isNotBlank()) {
        username = input
    } else {
        username = "Invitado"
    }

    println("\n¡Hola, $username! ¿En qué te puedo ayudar hoy?")
}
