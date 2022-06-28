package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val year: Int = Integer.parseInt(readLine())

    println(when {
        year % 4 == 0 && (year % 400 == 0 || year % 100 != 0) -> "1"
        else -> "0"
    })

}