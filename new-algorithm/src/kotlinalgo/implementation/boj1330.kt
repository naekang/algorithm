package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())

    val A: Int = Integer.parseInt(st.nextToken())
    val B: Int = Integer.parseInt(st.nextToken())

    println(when  {
        A > B -> ">"
        A < B -> "<"
        else -> "=="
    })

}