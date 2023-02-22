import java.io.File

class RockPaperScissors(input: List<String>) {

    private val data = input
    fun solving1(): Int {
        val scores1: Map<String, Int> = mapOf( //key,value pair
            "A X" to 1 + 3, //mina poäng
            "A Y" to 2 + 6,
            "A Z" to 3 + 0,
            "B X" to 1 + 0,
            "B Y" to 2 + 3,
            "B Z" to 3 + 6,
            "C X" to 1 + 6,
            "C Y" to 2 + 0,
            "C Z" to 3 + 3,
        )
        return data.sumOf { scores1[it] ?: 0 }
    }

    fun solving2(): Int {
        val scores2: Map<String, Int> = mapOf(
            "A X" to 3 + 0, //sax +3 (förlust)
            "A Y" to 1 + 3, //sten +1 (50/50)
            "A Z" to 2 + 6, //papper +2 (vinst)
            "B X" to 1 + 0,
            "B Y" to 2 + 3,
            "B Z" to 3 + 6,
            "C X" to 2 + 0,
            "C Y" to 3 + 3,
            "C Z" to 1 + 6,
        )
        return data.sumOf { scores2[it] ?: 0 } //lambda + if (elvis-operator, else- return noll)
    }
}

fun main(){
    val input: List<String> = File("src/main/kotlin/code2022Day2.txt").readLines()
    println(RockPaperScissors(input).solving1())
    println(RockPaperScissors(input).solving2())

}