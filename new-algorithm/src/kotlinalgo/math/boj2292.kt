package kotlinalgo.math

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = Integer.parseInt(readLine())

    var cnt = 1
    var range = 2

    println(when {
        N == 1 -> 1
        else -> {
            while (range <= N) {
                range += 6 * cnt
                cnt++
            }
            cnt
        }
    })
}