data class PersonL(val age: Int, val name: String)

lateinit var test: PersonL
var test2: PersonL? = null

fun main(args: Array<String>) {
    test = PersonL(0, "1")
    val p = ::PersonL
    val t = p(0, "2")
    println(::PersonL.name)
    test2?.let {
        println(it)
    }
    val list = listOf(1, 2, 3, 4, 5)
    list.asSequence()
            .map { it + 1 }
            .filter { it % 2 == 0 }
            .toList()

    testLambda {
        it == 1
    }
}
// lambda 就是一个对象
fun testLambda(test: (Int) -> Boolean): Boolean {
    return test.invoke(1)
}

