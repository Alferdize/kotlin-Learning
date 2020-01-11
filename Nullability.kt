fun main(){
    // var rocks : Int = null 
    // error: null can not be a value of a non-null type Int
    var rocks : Int? = null // Variable can be null
    var lotsOfFish : List<String?> = listOf(null,null)
    var everMoreFish : List<String>? = null
    // Array as well as elements of the array can be null
    var definitelyFish : List<String?>? = null
    definitelyFish = listOf(null,null)
    val amount : Double? = 10.0

    println(rocks)
    println(lotsOfFish)
    println(everMoreFish)
    println(definitelyFish)
    println(amount)
}