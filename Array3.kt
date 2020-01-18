
fun main(args: Array<String>){
    for(i in 'b'..'g') print(i)
    println()
    for(i in 1..5) print(i)
    println()
    for(i in 3..6 step 2) print(i)
    val array = Array(7){it*it}
    print(array.asList())
    for(i in 0..100 step 7) println(i.String() + "-")
}