/**
 * In-memory Chat History management utilizing Kotlin Collections and Sequences.
 *
 * In Lesson 7 we learn about read-only vs mutable collections,
 * functional transformations (map, filter, takeLast), and lazy Sequences.
 */

/**
 * Represents a single message exchange recorded in the in-memory chat session.
 */
data class ChatEntry(
    val sender: String,
    val message: String
)

/**
 * Manages the conversation history for the current interactive session.
 *
 * Encapsulates a private [MutableList] to protect internal state from accidental mutation,
 * exposing immutable views and lazy [Sequence] queries to callers.
 */
class ChatHistory {
    private val entries = mutableListOf<ChatEntry>()

    /**
     * Appends a new message entry to the session history.
     */
    fun add(sender: String, message: String) {
        entries.add(ChatEntry(sender = sender, message = message))
    }

    /**
     * Returns a read-only list containing all recorded entries.
     */
    fun getAll(): List<ChatEntry> = entries.toList()

    /**
     * Retrieves the most recent [limit] entries using eager collection slicing.
     */
    fun getRecentEntries(limit: Int = 5): List<ChatEntry> = entries.takeLast(limit)

    /**
     * Searches messages containing [query] using a lazy [Sequence] pipeline.
     *
     * Evaluates elements on-demand without generating intermediate collection copies on the Heap.
     */
    fun search(query: String): Sequence<ChatEntry> =
        entries.asSequence()
            .filter { it.message.contains(query, ignoreCase = true) }

    /**
     * Returns the total count of recorded messages.
     */
    val size: Int get() = entries.size

    /**
     * Checks whether the session history has no recorded messages.
     */
    fun isEmpty(): Boolean = entries.isEmpty()
}

/**
 * Global shared in-memory history instance for the interactive CLI session.
 */
val chatHistory = ChatHistory()
