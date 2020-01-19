class Aquarium(var width : Int = 10,var height : Int = 40,var length : Int = 100){
    // var width : Int = width
    // var height : Int = height
    // var length : Int = length

    var volume
        get() =  width * height * length / 1_000
        set(value) {
            height = (value * 1000) / (width*length)
        }
    
    var water = volume * 0.9
    init {
        println("First init block")
    }
    constructor(numberofFish : Int): this() {
        println("Number of Fish ${numberofFish}")
    }
    init {
        println("Last init block")
    }
}

fun main(args : Array<String>){
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = Aquarium()
    println("Volume : ${myAquarium.volume}")
    val smallAquarium = Aquarium(numberofFish=30)
    println("Volume : ${smallAquarium.volume}")

}