package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())

    val a: Int = st.nextToken().toInt()
    val b: Int = st.nextToken().toInt()

    val set = mutableSetOf<Int>()

    st = StringTokenizer(readLine())
    for (i in 1..a) {
        set.add(st.nextToken().toInt())
    }

    st = StringTokenizer(readLine())
    for (i in 1..b) {
        val num = st.nextToken().toInt()
        if (set.contains(num)) {
            set.remove(num)
        }
    }

    println(set.size)
    for (num in set.sorted()) {
        print("$num ")
    }
}