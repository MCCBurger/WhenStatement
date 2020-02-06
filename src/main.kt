fun main() {
    var number = 0
    var numberString =""

    //Ask user to input a number
    println("Please input a number between 1 and 10")
    number = readLine()!!.toInt()

    //Assign dayString based on the user input..If out of range print out of range
    when(number) {
        1 -> numberString = "Ein"
        2 -> numberString = "Zwei"
        3 -> numberString = "Drei"
        4 -> numberString = "Vier"
        5 -> numberString = "Funf"
        6 -> numberString = "Sechs"
        7 -> numberString = "Sieben"
        8 -> numberString = "Acht"
        9 -> numberString = "Neun"
        10 -> numberString = "Zehn"
        !in 1..10 -> numberString = "Out of range"
        else -> numberString = "Unknown"
    }
    println("The number $number is $numberString in German")
}