package kotlinalgo.recursion

import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val dp = arrayOfNulls<BigInteger>(10001)

    dp[0] = BigInteger.ZERO
    dp[1] = BigInteger.ONE

    for (i in 2..n) {
        dp[i] = dp[i - 2]!!.add(dp[i - 1])
    }
    println(dp[n])

}