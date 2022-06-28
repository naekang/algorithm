package kotlinalgo.programmers

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val input = readLine()
    println(solution(input))
}

fun solution(phone_number: String): String {
    val length = phone_number.length
    return "*".repeat(length - 4) + phone_number.replaceRange(0, length - 4, "")
}

