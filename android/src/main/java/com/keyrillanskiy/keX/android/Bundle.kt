package com.keyrillanskiy.keX.android

import android.os.Bundle

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

/**
 * Simple and clean way to create bundle
 */
inline fun Bundle(body: Bundle.() -> Unit): Bundle {
    return Bundle().apply(body)
}

/**
 * Throws [IllegalStateException] when bundle does not contain specified key.
 * Otherwise returns value.
 */
@Suppress(names = ["UNCHECKED_CAST"])
inline fun <T> Bundle.require(key: String): T {
    check(value = containsKey(key), lazyMessage = { "Value with key $key not found." })
    return get(key) as T
}

/**
 * Checks this bundle and alternative bundle.
 * Throws [IllegalStateException] when both bundles do not contain specified key.
 * Otherwise returns value.
 */
@Suppress(names = ["UNCHECKED_CAST"])
inline fun <T> Bundle?.require(key: String, alternative: Bundle? = null): T {
    return when {
        this?.containsKey(key) ?: false -> requireNotNull(value = this).require(key)
        alternative?.containsKey(key) ?: false -> requireNotNull(value = alternative).require(key)
        else -> throw IllegalArgumentException("Value with key $key not found.")
    }
}