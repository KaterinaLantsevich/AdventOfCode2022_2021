import java.io.File

class CalloriCounting{

    fun getMaxCalories(calories: Int) : Int {

        val input: List<String> =  File("src/main/kotlin/code2022Day1.txt").readLines()

        var maxCalories = 0
        var currentCalories = 0 //akkumulator

        for(i in input) {
            if(i =="") { //check för empty sträng
                currentCalories = 0
                continue
            }
            else {
                currentCalories += i.toInt() //eftersom det är en list of strings
            }
            if(currentCalories > maxCalories && currentCalories < calories) {
                maxCalories = currentCalories
            }
        }
        println("MaxCalories is $maxCalories")
        return maxCalories
    }
}

fun main() { //körde program 3 gånger för att få rätt inparameter i metoden getMaxCalories()
    println(CalloriCounting().getMaxCalories(100000)
            + CalloriCounting().getMaxCalories(69883)
              + CalloriCounting().getMaxCalories(69727))
}