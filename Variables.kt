fun main(){
    val aquarium:Number = 1 
    // aquarium = 2
    // val not Changeable 
    // error: val cannot be reassigned
    var fish = 2 // var Changeable 
    // fish = "Bubbles"
    // error: type mismatch: inferred type is 
    // String but Int was expected
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_CE
    val bytes = 0b1101001_01101001_10010100_10010010

    
    println(aquarium.toLong())
    println(fish)
    println(oneMillion)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)
}