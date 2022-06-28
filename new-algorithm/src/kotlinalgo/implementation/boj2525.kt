package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())

    var A = Integer.parseInt(st.nextToken())
    var B = Integer.parseInt(st.nextToken())
    var C = Integer.parseInt(readLine())

    when {
        B + C >= 60 -> {
            A += (B + C) / 60
            B = (B + C) % 60
            when {
                A >= 24 -> A %= 24
                else -> A
            }
        }
        else -> B += C
    }

    println("$A $B")
}