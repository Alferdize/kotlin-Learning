fun main(args:Array<String>){
    println("Hello ${args[0]}")

    val isUnit = println("This is an exression.")
    val temperature = 10
    val isHot = if(temperature > 50)
    true else false
    println(isHot)
    val message = "you are "+ if (temperature > 50) "fred" else "safe"
    println(message) 
}