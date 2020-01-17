fun main(){
    val numberOfFish = 50
    when(numberOfFish){
        0 -> println("No fish")
        50 -> println("Full tank")
        else -> println("Perfect")
    }

    val fishName = "Poppy Mac"
    when(fishName.length){
        0 -> println("No name of fish")
        in 3 .. 12 -> println("Good Name.")
        else -> println("OK")
    }
}