# Kotlin for Beginners Course Lab | Desde0

[English](README.md) | [Español](README.es.md)

This repository serves as the official companion laboratory for **Course 2: Kotlin for Beginners** from **Desde0** ([https://desde0.jesusdmedinac.com](https://desde0.jesusdmedinac.com)).

Throughout the course, you will incrementally build an interactive **AI Chat CLI** assistant while mastering foundational JVM architecture, idiomatic Kotlin, null safety, exhaustive control flow, and object-oriented engineering.

---

## 🧭 Git Tag Navigation

We use a linear Git *Tag* system so you can time-travel to any lesson state at will:

| Lesson | Starter Template Tag | Completed Solution Tag |
| :--- | :--- | :--- |
| **L1: Agnostic Environment & Hello World** | [`L1-start`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L1-start) | [`L1-done`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L1-done) |
| **L2: Variables & Null Safety** | [`L2-start`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L2-start) | [`L2-done`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L2-done) |
| **L3: Hierarchies & Control Flow** | [`L3-start`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L3-start) | [`L3-done`](https://github.com/jesusdmedinac/kotlin-course-2-lab/tree/L3-done) |

To jump to any lesson tag in your terminal:
```bash
git checkout L1-start
```

---

## 🚀 How to Run the Project (Multi-Environment)

This application is an interactive terminal command-line tool (CLI). You can run it comfortably depending on your tooling environment:

### 1. Android Studio / IntelliJ IDEA
1. Open [`src/main/kotlin/Main.kt`](src/main/kotlin/Main.kt).
2. Click the green **Play** (▶️) button located in the gutter to the left of the `fun main()` line.
3. The application will run inside the bottom **Run** window (interactive console), where you can type your input and press Enter.

### 2. Google Antigravity / Visual Studio Code / Cursor
1. Press the default build task shortcut: **`Cmd + Shift + B`** (macOS) or **`Ctrl + Shift + B`** (Linux/Windows).
2. Alternatively, open the command palette (`Cmd + Shift + P` or `Ctrl + Shift + P`), type `Tasks: Run Task`, and select **Run AI Chat CLI**.
3. An integrated interactive terminal session will open awaiting your keyboard input.

### 3. Command-Line Terminal (macOS, Linux, or PowerShell)
1. In the repository root, run:
   ```bash
   ./gradlew run --console=plain -q
   ```
   *(On Windows CMD / PowerShell, run `gradlew.bat run --console=plain -q`)*.
2. **Technical note:** The `--console=plain -q` flags suppress Gradle daemon status bars to ensure clean, uninterrupted keyboard interaction.
