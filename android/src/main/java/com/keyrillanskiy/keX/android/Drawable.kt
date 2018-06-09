package com.keyrillanskiy.keX.android

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.support.v7.content.res.AppCompatResources

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

/**
 * Note: do not forger to turn on support of compat vector drawables
 */
fun getVectorDrawable(context: Context, @DrawableRes drawableResId: Int): Drawable? {
    return doOnLollipop({
        ContextCompat.getDrawable(context, drawableResId)
    }, {
        AppCompatResources.getDrawable(context, drawableResId)
    })
}