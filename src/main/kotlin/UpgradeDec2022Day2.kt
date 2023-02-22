import java.io.File

val scores1 = mapOf(
"A X" to 4, "A Y" to 8, "A Z" to 3, //ger värdena direkt uta att summera + deklarerar map utanför metoden
"B X" to 1, "B Y" to 5, "B Z" to 9,
"C X" to 7, "C Y" to 2, "C Z" to 6,
)

fun solving1(input: List<String>) = println(input.mapNotNull { scores1[it] }.sum())
//om det finns element som är null,mapNotnull() filtrerar bort dem

val scores2 = mapOf(
    "A X" to 3, "A Y" to 4, "A Z" to 8,
    "B X" to 1, "B Y" to 5, "B Z" to 9,
    "C X" to 2, "C Y" to 6, "C Z" to 7,
)

fun solving2(input: List<String>) = println(input.mapNotNull { scores2[it] }.sum()) //metoden skriven på en rad

fun main() {
    val input: List<String> = File("src/main/kotlin/code2022Day2.txt").readLines()
    solving1(input)
    solving2(input)
}