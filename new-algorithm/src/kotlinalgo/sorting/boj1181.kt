package kotlinalgo.sorting

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N: Int = readLine().toInt()

    val arr = mutableSetOf<String>()

    repeat(N) {
        arr.add(readLine())
    }

    val list = arr.sortedWith(Comparator<String> {a, b ->
        if (a.length > b.length) 1
        else if (a.length < b.length) -1
        else a.compareTo(b)
    })

    list.forEach{ println(it) }

}