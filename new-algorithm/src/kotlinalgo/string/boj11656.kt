package kotlinalgo.string

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()
    val sb = StringBuilder()

    val set = TreeSet<String>()

    for (i in str.indices) {
        set.add(str.substring(i))
    }

    for (s in set) {
        sb.append(s).append('\n')
    }

    println(sb)

}