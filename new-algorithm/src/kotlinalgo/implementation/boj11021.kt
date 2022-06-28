package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var N = Integer.parseInt(readLine())
    val sb = StringBuilder()

    for (i in 1..N) {
        val st = StringTokenizer(readLine())
        val A = Integer.parseInt(st.nextToken())
        val B = Integer.parseInt(st.nextToken())
        sb.append("Case #").append(i).append(": ").append(A + B).append('\n')
    }

    println(sb)

}