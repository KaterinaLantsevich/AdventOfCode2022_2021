import java.io.File

class CalloriCounting2() {

    fun part1(input: List<String>): Int {
        val calories = mutableListOf(0)
        input.forEach { line ->
            if (line.isBlank()) calories.add(0)
            else calories[calories.lastIndex] += line.toIntOrNull() ?: 0 // omvandlar to Int,om null sätter noll då
        }
        return calories.max()
    }

    fun part2(input: List<String>): Int {
        val elves = mutableListOf(0)
        input.forEach { line ->
            if (line.isBlank()) elves.add(0)
            else elves[elves.lastIndex] += line.toIntOrNull() ?: 0
        }
        return elves.sortedDescending().subList(0, 3).sum()// sortedDescending() return element i Desc-ordning
    }
}

fun main() {

    val input: List<String> = File("src/main/kotlin/code2022Day1.txt").readLines()
    println(CalloriCounting2().part1(input))
    println(CalloriCounting2().part2(input))
}