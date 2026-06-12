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

---

## 🚀 Cómo ejecutar el proyecto (Multi-entorno)

Esta aplicación es una herramienta interactiva de consola (CLI). Puedes ejecutarla cómodamente según el entorno que utilices:

### 1. Android Studio / IntelliJ IDEA
* Abre [`src/main/kotlin/Main.kt`](src/main/kotlin/Main.kt).
* Haz clic en el botón verde de **Play** (▶️) situado al lado izquierdo de la línea `fun main()`.
* La aplicación se ejecutará en la pestaña inferior de **Run** (Consola interactiva), donde podrás escribir con tu teclado y presionar `Enter`.

### 2. Google Antigravity / Visual Studio Code
* Puedes presionar el atajo predeterminado de ejecución: **`Cmd + Shift + B`** (macOS) o **`Ctrl + Shift + B`** (Linux/Windows).
* O bien, abre la paleta de comandos (`Cmd + Shift + P` o `Ctrl + Shift + P`), escribe `Tasks: Run Task` y selecciona **Run AI Chat CLI**.
* Se abrirá una terminal interactiva integrada donde podrás interactuar con la aplicación.

### 3. Terminal (macOS, Linux o PowerShell)
* Ejecuta el siguiente comando:
  ```bash
  ./gradlew run --console=plain -q
  ```
  *(En Windows CMD/PowerShell: `gradlew.bat run --console=plain -q`)*
* **Nota técnica:** Las banderas `--console=plain -q` suprimen las barras de estado del daemon de Gradle para que los prompts de texto y la interacción por teclado sean limpios.

