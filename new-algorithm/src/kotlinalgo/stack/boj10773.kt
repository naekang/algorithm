package kotlinalgo.stack

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val K = Integer.parseInt(readLine())
    var sum = 0
    val stack = Stack<Int>()

    for (i in 0 until  K) {
        val num = Integer.parseInt(readLine())
        if (num != 0) stack.push(num)
        else stack.pop()
    }

    for (i in stack) {
        sum += i
    }

    println(sum)
}