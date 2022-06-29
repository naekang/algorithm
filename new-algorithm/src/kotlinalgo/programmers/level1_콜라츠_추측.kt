package kotlinalgo.programmers

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = Integer.parseInt(readLine())
    println(solution_콜라츠(n))
}

fun solution_콜라츠(num: Int): Int {
    var tmp = num.toLong()
    var cnt = 0;

    while (cnt < 500 && tmp > 1) {
        cnt++
        tmp = if (tmp % 2 == 0L) {
            tmp / 2
        } else {
            tmp * 3 + 1
        }
    }

    return if (cnt == 500)  -1 else cnt
}
