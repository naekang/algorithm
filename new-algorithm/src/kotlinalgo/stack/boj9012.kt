package kotlinalgo.stack

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var T = Integer.parseInt(readLine())
    val sb = StringBuilder()

    while (T-- != 0) {
        sb.append(findVPS(readLine())).append('\n')
    }

    println(sb.toString())

}

fun findVPS(s: String): String {
    val arr = s.toCharArray()
    val stack = Stack<Char>()

    for (c in arr) {
        when (c) {
            '(' -> stack.push(c)
            else -> when {
                stack.size == 0 -> stack.push(c)
                stack.peek() == '(' -> stack.pop()
            }
        }
    }

    return if (stack.size == 0) "YES" else "NO"

}