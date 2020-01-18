import java.util.Arrays

fun main(){
    var fish = 12
    var plants = 5
    val swarm = listOf(fish, plants)
    val bigSwarm = arrayOf(swarm,arrayOf("dolphin","whale","orka"))
    println(Arrays.toString(bigSwarm))
    
    val array = Array(5){ it * 2}
    println(array.asList())
}