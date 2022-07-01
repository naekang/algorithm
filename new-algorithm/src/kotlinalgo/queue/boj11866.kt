package kotlinalgo.queue

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    val sb = StringBuilder()

    val N = st.nextToken().toInt()
    val K = st.nextToken().toInt()

    val queue: Queue<Int> = LinkedList()

    for (i in 1..N) {
        queue.add(i)
    }

    sb.append('<')
    while (queue.size != 1) {
        for (i in 0 until K - 1) {
            queue.add(queue.poll())
        }
        sb.append(queue.poll()).append(", ")
    }
    sb.append(queue.poll()).append('>')

    println(sb)
}