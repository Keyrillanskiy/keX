package com.keyrillanskiy.keX.kotlin

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

fun <T> Array<T>.swap(index1: Int, index2: Int) {
    this[index1] = this[index2].also { this[index2] = this@swap[index1] }
}