package com.keyrillanskiy.keX.android

import android.annotation.TargetApi
import android.os.Build

/**
 * These functions allow you to throw out ugly if-else blocks, which checks sdk_int value
 *
 * @author keyrillanskiy
 *         09.06.2018.
 */

private fun <R> doOnSpecifiedVersionOrGreater(version: Int, onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return if (Build.VERSION.SDK_INT >= version) {
        onThisVersion.invoke()
    } else {
        onPrevious?.invoke()
    }
}

@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
fun <R> doOnIceScreamSandwich(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
fun <R> doOnApi15(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnIceScreamSandwich(onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
fun <R> doOnJellyBean(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.JELLY_BEAN, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
fun <R> doOnApi16(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnJellyBean(onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
fun <R> doOnApi17(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.JELLY_BEAN_MR1, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
fun <R> doOnApi18(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.JELLY_BEAN_MR2, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.KITKAT)
fun <R> doOnKitkat(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.KITKAT, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.KITKAT)
fun <R> doOnApi19(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnKitkat(onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.KITKAT_WATCH)
fun <R> doOnKitkatWatch(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.KITKAT_WATCH, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.KITKAT_WATCH)
fun <R> doOnApi20(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnKitkatWatch(onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
fun <R> doOnLollipop(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.LOLLIPOP, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
fun <R> doOnApi21(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnLollipop(onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.LOLLIPOP_MR1)
fun <R> doOnApi22(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.LOLLIPOP_MR1, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.M)
fun <R> doOnMarshmallow(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.M, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.M)
fun <R> doOnApi23(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnMarshmallow(onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.N)
fun <R> doOnNougat(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.N, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.N)
fun <R> doOnApi24(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnNougat(onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.N_MR1)
fun <R> doOnApi25(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.N_MR1, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.O)
fun <R> doOnOreo(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnSpecifiedVersionOrGreater(Build.VERSION_CODES.O, onThisVersion, onPrevious)
}

@TargetApi(Build.VERSION_CODES.O)
fun <R> doOnApi26(onThisVersion: () -> R, onPrevious: (() -> R)? = null): R? {
    return doOnOreo(onThisVersion, onPrevious)
}