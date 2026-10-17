/**
 * Standard ANSI escape codes for styling compatible terminal output.
 */
private const val ANSI_RESET = "\u001B[0m"
private const val ANSI_BOLD = "\u001B[1m"
private const val ANSI_RED = "\u001B[31m"
private const val ANSI_GREEN = "\u001B[32m"
private const val ANSI_YELLOW = "\u001B[33m"
private const val ANSI_CYAN = "\u001B[36m"

/**
 * Extension functions on the standard String class.
 * Enables fluent color styling: "Alert".red().bold()
 */
fun String.cyan(): String = "$ANSI_CYAN$this$ANSI_RESET"
fun String.green(): String = "$ANSI_GREEN$this$ANSI_RESET"
fun String.yellow(): String = "$ANSI_YELLOW$this$ANSI_RESET"
fun String.red(): String = "$ANSI_RED$this$ANSI_RESET"
fun String.bold(): String = "$ANSI_BOLD$this$ANSI_RESET"

/**
 * Infix function to format message tags with human-readable syntax.
 * Example: "Connected" taggedWith "INFO" -> "[INFO] Connected"
 */
infix fun String.taggedWith(tag: String): String = "[$tag] $this"
