/**
 * Message sanitization and filtering module using functional programming concepts.
 *
 * In Lesson 6 we learn that functions are first-class citizens in Kotlin.
 * We can pass functions as parameters, return them, and store them in variables.
 */

/**
 * Standard list of prohibited keywords to simulate chat moderation and security filtering.
 */
val FORBIDDEN_WORDS = setOf("spam", "hack", "bot", "exploit")

/**
 * Custom higher-order extension function that mimics the standard library [filter].
 *
 * Takes a [predicate] function type `(T) -> Boolean` and evaluates each element.
 * Marked as [inline] to eliminate runtime heap allocation of Function1 instances at the call site.
 */
inline fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (item in this) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}

/**
 * Sanitizes input text by applying a custom [transform] function to every word.
 *
 * Demonstrates a higher-order function where a lambda is used for word-by-word transformation.
 */
inline fun sanitizeMessage(
    text: String,
    transform: (String) -> String
): String {
    val words = text.split(" ")
    val transformedWords = mutableListOf<String>()
    for (word in words) {
        transformedWords.add(transform(word))
    }
    return transformedWords.joinToString(" ")
}

/**
 * Censors forbidden words in a text using a custom censorship [predicate] lambda.
 *
 * Demonstrates trailing lambda syntax and function composition.
 *
 * @param text The raw message to be censored.
 * @param replacement The string to mask prohibited words with (default: "***").
 * @param isForbidden A lambda predicate determining whether a given word is forbidden.
 */
inline fun censorWords(
    text: String,
    replacement: String = "***",
    isForbidden: (String) -> Boolean
): String = sanitizeMessage(text) { word ->
    if (isForbidden(word.lowercase())) replacement else word
}
