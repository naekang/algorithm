package javaalgo.haulzzang.week15

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())

    val K: Int = Integer.parseInt(st.nextToken())
    val L: Int = Integer.parseInt(st.nextToken())

    val set: LinkedHashSet<String> = linkedSetOf()

    for (i in 1..L) {
        val num = readLine()
        if (set.contains(num)) {
            set.remove(num)
            set.add(num)
        } else {
            set.add(num)
        }
    }

    for ((index, num) in set.withIndex()) {
        if (index == K) {
            break
        }
        println(num)
    }
}