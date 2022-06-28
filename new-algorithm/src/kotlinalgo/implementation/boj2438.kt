package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = Integer.parseInt(readLine())

    for (i in 1..N) {
        for (j in N - i until N) {
            print("*")
        }
        println()
    }
}