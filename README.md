# Laboratorio del curso de Kotlin para principiantes

## Chat de IA en la terminal

### Entregables del Laboratorio 1

Clona el repositorio oficial del curso. Usaremos un sistema de *Tags* de Git para que puedas viajar en el tiempo a cualquier lección.

[🧑‍💻 Código Inicial (Plantilla)](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L1-start)
[✅ Código Resuelto](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L1-done)

### Instrucciones

En la industria profesional de Kotlin y Java, no usamos editores de texto ligeros. Usamos **Entornos de Desarrollo Integrados (IDEs)** increíblemente poderosos.
1. Descarga e instala [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/) (es gratuito).
2. Al abrirlo, selecciona **New Project**.
3. En las opciones, elige **Kotlin**, selecciona **Gradle** como Build System, y asegúrate de elegir el JDK (Java Development Kit) versión 17 o superior.

### Paso 2: Creando el Entry Point

Todo programa necesita un "punto de entrada", el lugar exacto donde la JVM sabe que debe comenzar a leer. En Kotlin, esto es simplemente una función llamada `main`.

Abre el archivo `src/main/kotlin/Main.kt` que se generó y borra su contenido. Vamos a escribir el banner de bienvenida de nuestro Chat.

```kotlin
/**
 * Punto de entrada principal (Entry Point) de nuestra aplicación Kotlin.
 *
 * La JVM buscará exactamente esta función 'main' en todo nuestro proyecto
 * para comenzar la ejecución.
 */
fun main() {
    // println es una función de la librería estándar de Kotlin.
    // Lo que hace es imprimir el texto en la consola de la computadora
    // y añadir un salto de línea (Enter) invisible al final.
    
    println("===============================")
    println("🤖 Welcome to AI Chat CLI")
    println("===============================")
}
```

### Paso 3: Ejecutar
En la parte superior derecha de tu IntelliJ, o justo al lado de la palabra `main`, verás un botón verde de **Play** (▶️). Presiónalo. 
IntelliJ llamará al compilador de Kotlin, transformará este texto en Bytecode, y luego llamará a la JVM para que lo ejecute en tu terminal. 

Si ves el banner de bienvenida... ¡Felicidades! Tienes tu entorno agnóstico configurado y listo para empezar a programar lógica en la siguiente lección.
