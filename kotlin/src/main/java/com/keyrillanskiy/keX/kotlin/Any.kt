package com.keyrillanskiy.keX.kotlin

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

inline fun Any?.isNull() = this == null

inline fun Any?.isNotNull() = !this.isNull()


/**
 * Wrapper for nullable objects
 */
sealed class Optional<out T : Any> {
    fun toNullable(): T? = when (this) {
        is Some -> value
        is None -> null
    }
}

data class Some<out T : Any>(val value: T) : Optional<T>() {
    override fun toString() = "Some($value)"
}

object None : Optional<Nothing>() {
    override fun toString() = "None"
}

fun <T : Any> T?.toOptional(): Optional<T> = if (this == null) None else Some(this)