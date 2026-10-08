# Laboratorio del Curso de Kotlin para Principiantes | Desde0

[English](README.md) | [Español](README.es.md)

Este repositorio es el laboratorio complementario oficial para el **Curso 2: Kotlin para Principiantes** de **Desde0** ([https://desde0.jesusdmedinac.com](https://desde0.jesusdmedinac.com)).

A lo largo del curso, construirás paso a paso un **AI Chat CLI** (un asistente de consola interactivo) mientras aprendes conceptos fundamentales de la JVM, Kotlin idiomático, seguridad contra nulos, control de flujo exhaustivo y programación orientada a objetos.

---

## 🧭 Navegación por Tags de Git

Utilizamos un sistema de *Tags* lineales de Git para que puedas viajar en el tiempo a cualquier estado del proyecto:

| Lección | Tag Inicial (Plantilla) | Tag Resuelto (Solución) |
| :--- | :--- | :--- |
| **L1: Entorno y Hola Mundo** | [`L1-start`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L1-start) | [`L1-done`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L1-done) |
| **L2: Variables y Null Safety** | [`L2-start`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L2-start) | [`L2-done`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L2-done) |
| **L3: Jerarquías y Control de Flujo** | [`L3-start`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L3-start) | [`L3-done`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L3-done) |

Para moverte a cualquier lección en tu terminal:
```bash
git checkout L1-start
```

---

## 🚀 Cómo Ejecutar el Proyecto (Multi-entorno)

Esta aplicación es una herramienta interactiva de consola (CLI). Puedes ejecutarla cómodamente según el entorno que utilices:

### 1. Android Studio / IntelliJ IDEA
1. Abre el archivo [`src/main/kotlin/Main.kt`](src/main/kotlin/Main.kt).
2. Haz clic en el botón verde de **Play** (▶️) situado al lado izquierdo de la línea `fun main()`.
3. La aplicación se ejecutará en la pestaña inferior **Run** (consola interactiva), donde podrás escribir con tu teclado y presionar Enter.

### 2. Google Antigravity / Visual Studio Code / Cursor
1. Presiona el atajo predeterminado de construcción: **`Cmd + Shift + B`** (macOS) o **`Ctrl + Shift + B`** (Linux/Windows).
2. O bien, abre la paleta de comandos (`Cmd + Shift + P` o `Ctrl + Shift + P`), escribe `Tasks: Run Task` y selecciona **Run AI Chat CLI**.
3. Se abrirá una terminal interactiva integrada lista para recibir tus entradas.

### 3. Terminal de Comandos (macOS, Linux o PowerShell)
1. En la raíz del repositorio, ejecuta:
   ```bash
   ./gradlew run --console=plain -q
   ```
   *(En Windows CMD / PowerShell usa `gradlew.bat run --console=plain -q`)*.
2. **Nota técnica:** Las banderas `--console=plain -q` suprimen las barras de estado del daemon de Gradle para que la interacción por teclado sea limpia y fluida.
