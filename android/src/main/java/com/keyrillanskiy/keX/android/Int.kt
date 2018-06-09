package com.keyrillanskiy.keX.android

import android.content.res.Resources

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

/** Translates Px to Dp */
val Int.dp: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()

/** Translates Dp to Px */
val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()