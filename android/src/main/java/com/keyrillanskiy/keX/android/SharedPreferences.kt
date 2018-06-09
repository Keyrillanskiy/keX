package com.keyrillanskiy.keX.android

import android.content.SharedPreferences

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

inline fun SharedPreferences.edit(block: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.block()
    editor.apply()
}