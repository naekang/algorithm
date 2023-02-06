package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n: Int = readLine().toInt()
    val map = TreeMap<String, String>(compareBy<String?> { it }.reversed())

    for (i in 1..n) {
        val st = StringTokenizer(readLine())
        map[st.nextToken()] = st.nextToken()
    }

    for ((key, value) in map.entries) {
        if (value != "leave") {
            println(key)
        }
    }
}