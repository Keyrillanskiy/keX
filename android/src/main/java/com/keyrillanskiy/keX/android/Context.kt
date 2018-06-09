package com.keyrillanskiy.keX.android

import android.content.Context
import android.content.res.Configuration
import android.support.annotation.StringRes
import android.widget.Toast

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

/**
 * Checks availability of physical keyboard.
 */
fun Context.isHardKeyboardAvailable(): Boolean = resources.configuration.keyboard != Configuration.KEYBOARD_NOKEYS

inline fun Context.toast(message: CharSequence, isLong: Boolean = false): Toast {
    return if (isLong) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).apply { show() }
    } else {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).apply { show() }
    }
}

inline fun Context.toast(@StringRes resId: Int, isLong: Boolean = false): Toast {
    return if (isLong) {
        Toast.makeText(this, resId, Toast.LENGTH_LONG).apply { show() }
    } else {
        Toast.makeText(this, resId, Toast.LENGTH_SHORT).apply { show() }
    }
}
