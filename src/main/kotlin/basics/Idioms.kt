package basics

import java.lang.IllegalArgumentException


/**
data class가 제공하는 것들
    - getter & setter(var로 선언된 것들에만 setter 제공)
    - equals()
    - hashCode()
    - toString()
    - copy()
    - component()
 */
data class Person(val name: String, var age: Int)


fun main() {
    val person = Person("minchul", 26)

    val list = listOf("a", "b", "c", null) // Read-only List

    println(list[3] ?: "못찾았음!!") // ?: 뒤의 코드는 null일 경우에 실행됨

    val foo = list[2]
    println(foo?.let { "찾았음!!" }) // null이 아닐 때 실행됨

    val p: String by lazy { "hi" }

    // 추상 클래스 인스턴스화
    val myCar = object : Car() {
        override fun drive() {
            println("부릉 부릉")
        }
    }
    myCar.drive()

    // SWAP
    var a = 1
    var b = 2
    println("a = ${a}, b = $b")
    a = b.also { b = a }
    println("a = ${a}, b = $b")

}

abstract class Car {
    abstract fun drive()
}
