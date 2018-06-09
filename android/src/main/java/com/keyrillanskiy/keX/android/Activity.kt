package com.keyrillanskiy.keX.android

import android.app.Activity

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

fun Activity.hideKeyboard() = currentFocus?.hideKeyboard()