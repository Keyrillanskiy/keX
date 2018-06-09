package com.keyrillanskiy.keX.android

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

fun View.showKeyboard() {
    requestFocus()
    if (!context.isHardKeyboardAvailable()) {
        (context?.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager)?.showSoftInput(this, 0)
    }
}

fun View.hideKeyboard() {
    (context?.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager)
            ?.hideSoftInputFromWindow(windowToken, 0)
}