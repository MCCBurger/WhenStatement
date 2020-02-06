fun main() {
    var number = 0
    var dayString =""

    //Ask user to input a number
    println("Please input a number between 1 and 10")
    number = readLine()!!.toInt()

    //Assign dayString based on the user input..If out of range print out of range
    when(number) {
        1 -> dayString = "Ein"
        2 -> dayString = "Zwei"
        3 -> dayString = "Drei"
        4 -> dayString = "Vier"
        5 -> dayString = "Funf"
        6 -> dayString = "Sechs"
        7 -> dayString = "Sieben"
        8 -> dayString = "Acht"
        9 -> dayString = "Neun"
        10 -> dayString = "Zehn"
        !in 1..10 -> dayString = "Out of range"
        else -> dayString = "Unknown"
    }
    println("The number $number is $dayString in German")
}