package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val x = Integer.parseInt(readLine())
    val y = Integer.parseInt(readLine())

    println(when {
        x > 0 && y > 0 -> "1"
        x > 0 && y < 0 -> "4"
        x < 0 && y > 0 -> "2"
        x < 0 && y < 0 -> "3"
        else -> throw IllegalArgumentException("x, y cannot be 0")
    })
}