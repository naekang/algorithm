package kotlinalgo.programmers

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = Integer.parseInt(readLine())

    println(solution(input))

}

fun solution(x: Int): Boolean {
    val sum = x.toString().map {
        it.code - '0'.code
    }.sum()

    return when {
        x % sum != 0 -> false
        else -> true
    }
}