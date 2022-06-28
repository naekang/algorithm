package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())

    val A = Integer.parseInt(st.nextToken())
    val B = Integer.parseInt(st.nextToken())
    val C = Integer.parseInt(st.nextToken())

    val list = listOf(A, B, C).sorted()
    val listSet = list.toMutableSet()

    println(
        when (listSet.size) {
            1 -> list[0] * 1000 + 10000
            2 -> list[1] * 100 + 1000
            else -> list[2] * 100
        }
    )
}