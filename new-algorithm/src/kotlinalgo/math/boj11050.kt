package kotlinalgo.math

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (N, M) = readLine().split(' ').map { it.toInt() }

    var ans = 1
    repeat(M) {
        ans = ans * (N - it) / (it + 1)
    }

    println(ans)
}