package com.keyrillanskiy.keX.android

import android.content.Context
import android.net.Uri
import android.support.v4.content.FileProvider
import java.io.File

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

inline fun File.toUri() = Uri.fromFile(this)

inline fun File.toUri(context: Context, authority: String) = FileProvider.getUriForFile(context, authority, this)