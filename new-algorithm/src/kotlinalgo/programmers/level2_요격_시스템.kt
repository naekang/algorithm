package kotlinalgo.programmers

fun main() {
    val targets1 = arrayOf(intArrayOf(4, 5), intArrayOf(4, 8), intArrayOf(10, 14), intArrayOf(11, 13), intArrayOf(5, 12), intArrayOf(3, 7), intArrayOf(1, 4))

    println(solution(targets1))
}

fun solution(targets: Array<IntArray>): Int {
    return targets.sortedBy { it[1] }.fold(0 to 0) { (answer, e), ints ->
        if (ints[0] >= e) (answer + 1) to ints[1] else answer to e
    }.first
}