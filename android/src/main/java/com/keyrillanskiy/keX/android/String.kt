package com.keyrillanskiy.keX.android

import android.net.Uri
import android.support.v4.content.FileProvider

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

inline fun String.toUri(): Uri = Uri.parse(this)

/**
 * Ellipsizes the current string, truncating at defined amount of characters
 */
fun String.ellipsize(maxCharacters: Int, charactersAfterEllipsis: Int = 0): String {
    if (maxCharacters < 3) {
        throw IllegalArgumentException("maxCharacters must be at least 3 because the ellipsis already take up 3 characters")
    } else if (maxCharacters - 3 < charactersAfterEllipsis) {
        throw IllegalArgumentException("charactersAfterEllipsis must be less than maxCharacters")
    }
    return if (length < maxCharacters) this else "${substring(0, maxCharacters - 3 - charactersAfterEllipsis)}...${substring(length - charactersAfterEllipsis)}"
}