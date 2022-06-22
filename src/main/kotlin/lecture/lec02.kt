package lecture

import java.lang.IllegalArgumentException

fun main() {
    val str: String? = "hello world"
//    println(str.length) // 불가능(컴파일 에러)
    println(str?.length) // 가능

    val str2: String? = "ABC"
    println(str2?.length ?:0)
    val str3: String? = null
    println(str3?.length ?:0)
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null은 들어올 수 없어요!")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}


