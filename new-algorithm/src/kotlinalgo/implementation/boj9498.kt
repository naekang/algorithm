package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val score: Int = Integer.parseInt(readLine())

    println(
        when (score) {
            in 90..100 -> "A"
            in 80 until  90 -> "B"
            in 70 until  80 -> "C"
            in 60 until  70 -> "D"
            else -> "F"
        }
    )
}