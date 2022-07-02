package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())

    var E = st.nextToken().toInt()
    var S = st.nextToken().toInt()
    var M = st.nextToken().toInt()

    var e = 1
    var s = 1
    var m = 1
    var year = 1

    while (true) {
        if (e == E && s == S && m == M) break

        e++
        s++
        m++

        if (e == 16) e = 1
        if (s == 29) s = 1
        if (m == 20) m = 1
        year++
    }

    println(year)
}