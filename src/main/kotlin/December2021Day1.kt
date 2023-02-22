import java.io.File

class SonarSwep(input: List<String>) {

    val data = input.map(String::toInt)

    fun countIncreasingValues(): Int {
        var count = 0
        var prev = data.first() //inga mätningar före det första elementet
        data.drop(1).forEach { current -> // Få alla element förutom det som man anger i drop()
            if (current > prev) {
                ++count
            }
            prev = current
        }
        return count
    }

    fun slidingWindowMeasurements() :Int {
        val sums = data.windowed(3).map { it.sum() } // windowed() ger alla element i valt interval som en list
        var count = 0
        var prev = sums.first()
        sums.drop(1).forEach { current -> // Få alla element förutom det som man anger i drop()
            if (current > prev) {
                ++count
            }
            prev = current
        }
        return count
    }
}

fun main() {
    val input: List<String> = File("src/main/kotlin/code2021day1.txt").readLines()
    println(SonarSwep(input).countIncreasingValues())
    println(SonarSwep(input).slidingWindowMeasurements())
}