package kotlinalgo.programmers

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = Integer.parseInt(readLine())
    val arr = IntArray(N)
    val st = StringTokenizer(readLine())
    for (i in 0 until  N) {
        arr[i] = Integer.parseInt(st.nextToken())
    }
    println(solution(arr))
}

fun solution(arr: IntArray): Double {
//    var sum = 0
//    for (i in arr) {
//        sum += i
//    }
//
//    return sum.toDouble() / arr.size.toDouble()
    return arr.average()
}

