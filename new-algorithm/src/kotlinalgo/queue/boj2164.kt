package kotlinalgo.queue

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = Integer.parseInt(readLine())

    val queue: Queue<Int> = LinkedList()

    for (i in 1..N) {
        queue.add(i)
    }

    while (queue.size > 1) {
        queue.remove()
        queue.add(queue.poll())
    }

    println(queue.poll())

}