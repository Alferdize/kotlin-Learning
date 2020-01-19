fun main(args : Array<String>){
    println("\n Your fortune is : ${getFortuneCookie()}")
}

fun getFortuneCookie():String{
    val fortune = listOf("1","2","3")
    val birthday = readLine().toIntOrNull() ?; 1
    return fortune[birthday.rem(fortune.size)]
}

