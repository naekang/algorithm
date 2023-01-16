package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sum: Int = 0
    for (i in 1..5) {
        sum += Integer.parseInt(readLine())
    }

    println(sum)
}