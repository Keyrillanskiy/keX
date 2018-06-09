package com.keyrillanskiy.keX.android

import android.content.Intent
import android.content.pm.PackageManager

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

/**
 * Checks that there is at least one application, which can handle this intent
 * */
inline fun Intent.safeLaunch(packageManager: PackageManager, onSafe: (Intent) -> Unit, onError: () -> Unit = {}) {
    val activities = packageManager.queryIntentActivities(this, 0)
    if ((activities?.size ?: 0) > 0) onSafe.invoke(this) else onError.invoke()
}