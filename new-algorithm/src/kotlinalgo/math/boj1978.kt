package kotlinalgo.math

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N: Int = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }
    var ans: Int = 0

    for (num in numbers) {
        if (checkNum(num)) {
            ans++
        }
    }

    println(ans)
}

fun checkNum(num: Int): Boolean {
    if (num == 1) return false
    if (num == 2) return true
    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}