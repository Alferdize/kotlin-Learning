fun main(){
    val decoration = "rock paper scissors rules"
    print(decoration.filter{
        it.contains("rock")
    }.sortedBy{
        it.length
    })
}