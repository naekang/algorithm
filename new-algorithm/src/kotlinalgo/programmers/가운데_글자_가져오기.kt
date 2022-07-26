package kotlinalgo.programmers

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val input = readLine()
    println(solution2(input))
}

fun solution2(s: String): String {

    return s.substring((s.length - 1) / 2, s.length / 2 + 1)

}