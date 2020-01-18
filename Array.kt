import java.util.Arrays

fun main(args: Array<String>) {
    val nullTest:Int ?= null
    println(nullTest ?: 0)
    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text)
    val school = arrayOf("tuna","salman","shark")
    println(Arrays.toString(arrayOf(2,"Fon")))
    
}