package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N: Int = Integer.parseInt(readLine())

    for(i in 1..N) println(i)

}