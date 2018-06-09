package com.keyrillanskiy.keX.android

import android.text.Editable
import android.text.TextWatcher
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

fun TextView.disableCopyPaste() {
    customSelectionActionModeCallback = object : ActionMode.Callback {
        override fun onCreateActionMode(mode: ActionMode?, menu: Menu): Boolean = false
        override fun onPrepareActionMode(mode: ActionMode?, menu: Menu): Boolean = false
        override fun onActionItemClicked(mode: ActionMode?, item: MenuItem): Boolean = false
        override fun onDestroyActionMode(mode: ActionMode?) {}
    }
    isLongClickable = false
    setTextIsSelectable(false)
}


/**
 * Use this textWatcher extensions instead of addTextChangedListener(TextWatcher), because often you do not need all three callbacks.
 * This extensions allow you to clean up your code.
 */
inline fun TextView.textWatcher(init: KeXTextWatcher.() -> Unit) = addTextChangedListener(KeXTextWatcher().apply(init))

inline fun KeXTextWatcher.Companion.setup(init: KeXTextWatcher.() -> Unit): KeXTextWatcher = KeXTextWatcher().apply(init)

class KeXTextWatcher : TextWatcher {

    companion object { /* Empty. */ }

    // Listener's
    var beforeChanged: ((text: CharSequence?, start: Int, count: Int, after: Int) -> Unit)? = null
    var onChanged: ((text: CharSequence?, start: Int, before: Int, count: Int) -> Unit)? = null
    var afterChanged: ((text: Editable?) -> Unit)? = null

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        beforeChanged?.invoke(s, start, count, after)
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        onChanged?.invoke(s, start, before, count)
    }

    override fun afterTextChanged(s: Editable?) {
        afterChanged?.invoke(s)
    }
}