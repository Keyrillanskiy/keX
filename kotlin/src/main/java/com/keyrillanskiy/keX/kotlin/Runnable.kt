package com.keyrillanskiy.keX.kotlin

/**
 * @author keyrillanskiy
 *         09.06.2018.
 */

/**
 * Simple and clean way to create runnable
 */
fun runnable(body: Runnable.(Runnable) -> Unit) = object : Runnable {
    override fun run() {
        this.body(this)
    }
}