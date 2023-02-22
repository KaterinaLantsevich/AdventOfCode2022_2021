import java.io.File

fun main() {
    fun part1(input: List<Int>): Int {
        return input.windowed(2).count {
            it.first() < it.last()
        }
    }

    fun part2(input: List<Int>): Int {
        return input.windowed(4).count {
            it.first() < it.last()
        }
    }

    val input: List<Int> = File("src/main/kotlin/code2021day1.txt").readLines().map(String::toInt)
    //läser in data direkt till List<Int> istället för List<String>
    println(part1(input))
    println(part2(input))
}