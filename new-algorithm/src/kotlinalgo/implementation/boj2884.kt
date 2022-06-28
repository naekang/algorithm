package kotlinalgo.implementation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())

    var H = Integer.parseInt(st.nextToken())
    var M = Integer.parseInt(st.nextToken())

    when {
        M < 45 -> {
            M += 15
            when {
                H <= 0 -> {
                    H = 23
                }
                else -> H--
            }
        }
        else -> {
            M -= 45
        }
    }

    println("$H $M")

}