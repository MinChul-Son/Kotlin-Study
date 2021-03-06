package lecture

import lecture.lec02.Person
import java.lang.IllegalArgumentException

fun main() {
    val str: String? = "hello world"
//    println(str.length) // 불가능(컴파일 에러)
    println(str?.length) // 가능

    val str2: String? = "ABC"
    println(str2?.length ?:0)
    val str3: String? = null
    println(str3?.length ?:0)

    val person = Person("철수")
    startsWith4(person.name)

    val person2 = Person(null)
    startsWith4(person2.name) // 컴파일 에러!
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null은 들어올 수 없어요!")

//    if (str == null) {
//        throw IllegalArgumentException("null은 들어올 수 없어요!")
//    }
//    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")

//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false

//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWith4(str: String): Boolean {
    return str.startsWith("A")
}

