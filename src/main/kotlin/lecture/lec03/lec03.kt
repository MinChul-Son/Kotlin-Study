package lecture.lec03

import lecture.lec02.Person
import java.lang.IllegalArgumentException

fun main() {
    val number1 = 4
//    val number2: Long = number1 // 컴파일에러
    val number2: Long = number1.toLong()

    println(number1 + number2)

    val person = Person("철수")
    println("이름은 ${person.name}")

    val str = """
        안녕하세요!
        Hello!
    """.trimIndent()
    println(str)

    var str2 = "ABC"
    println(str2[0])
}

fun printNameIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.name)
        println(obj.name)
    }
}

fun printNameIfPerson2(obj: Any) {
    if (obj !is Person) {
        println("person이 아니에요!")
    }
}

fun printNameIfPerson3(obj: Any?) {
    val person = obj as? Person
//    println(person.name) // 컴파일 에러
    println(person?.name)
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
