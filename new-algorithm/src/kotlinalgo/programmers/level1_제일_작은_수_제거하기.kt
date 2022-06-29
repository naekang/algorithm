package kotlinalgo.programmers

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = Integer.parseInt(readLine())
    val arr = IntArray(N)
    val st = StringTokenizer(readLine())
    for (i in 0 until  N) {
        arr[i] = Integer.parseInt(st.nextToken())
    }
    solutionRemove(arr).forEach { println(it) }
}

fun solutionRemove(arr: IntArray): IntArray =
    if (arr.size == 1) {
        intArrayOf(-1)
    } else {
        val min = arr.toList().minOrNull()
        arr.filter { it != min }.toIntArray()
    }

