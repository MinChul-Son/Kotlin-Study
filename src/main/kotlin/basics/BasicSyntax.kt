package basics

fun main(args: Array<String>) {
    print("3 + 5 = ")
    println(sum1(3, 5))

    println(sum2(3, 5))

    sum3(3, 5)

    sum4(3, 5)

    val foo1: Int = 1 // 즉시 선언
    val foo2 = 2 // 타입 추론 -> Int
    val foo3: Int //
//    foo2 += 2 // val은 재할당 불가 `final`

    var x = 5
    x += 2 // var은 재할당 가능
    println(x)


}

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun sum3(a: Int, b: Int): Unit { // Unit이 Java에서의 Void
    println("$a 더하기 ${b}는 ${a + b}입니다.")
}

fun sum4(a: Int, b: Int) { // Unit은 생략 가능
    println("$a 더하기 ${b}는 ${a + b}입니다.")
}
