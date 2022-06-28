package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n: Int = Integer.parseInt(readLine())
    var sum = 0

    (1..n).forEach{
        sum += it
    }

    println(sum)
}