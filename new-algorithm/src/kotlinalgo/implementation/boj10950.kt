package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var N = Integer.parseInt(readLine())
    val sb = StringBuilder()

    while (N-- > 0) {
        val st = StringTokenizer(readLine())
        val A = Integer.parseInt(st.nextToken())
        val B = Integer.parseInt(st.nextToken())
        sb.append(A + B).append('\n')
    }

    println(sb)

}