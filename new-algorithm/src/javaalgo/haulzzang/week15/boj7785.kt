package javaalgo.haulzzang.week15

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n: Int = Integer.parseInt(readLine())

    val map: MutableMap<String, String> = mutableMapOf()
    for (i in 1..n) {
        val st = StringTokenizer(readLine())
        val name = st.nextToken()
        val type = st.nextToken()

        map[name] = type
    }

    val answerList: MutableList<String> = mutableListOf()
    for (entry in map) {
        if (entry.value.equals("enter")) {
            answerList.add(entry.key)
        }
    }

    for (ans in answerList.sortedDescending()) {
        println(ans)
    }
}