package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val nums = ArrayList<Int>()

    for (i in 1..3) {
        nums.add(Integer.parseInt(readLine()))
    }

    println(nums.sorted()[1])
}