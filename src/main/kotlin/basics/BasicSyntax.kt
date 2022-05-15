package basics

open class Shape {
    open fun draw() { // override 가능
    }
    fun fill(){ // override 불가능
        println("도형을 색칠합니다.")
    }
}

class Rectangle(private var height: Double, private var length: Double): Shape() {
    var perimeter = (height + length) * 2

    override fun draw() {
        println("직사각형을 그렸습니다.")
    }

    fun isSquare() {
        if (height == length) {
            return println("정사각형입니다.")
        }
        return println("직사각형입니다.")
    }
}

fun main() {
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

    val rectangle = Rectangle(2.0, 5.0)
    println(rectangle.perimeter)
    rectangle.draw()
    rectangle.fill()
    rectangle.isSquare()

    val items = listOf("apple", "banana", "strawberry", 1, "hamburger")
    for (item in items) {
        println(item)
        println(translationFruitName(item))
    }

    for (index in items.indices) {
        println("${index}번째는 ${items[index]}입니다.")
    }

    for (x in 1..5) {
        print(x)
    }

    println()

    for (x in 1..10 step 2) {
        print(x)
    }

    println()

    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    println()

    when {
        "apple" in items -> println("사과가 있습니다.")
    }

    var a: String
//    a = null // 컴파일에러 , null이 들어갈 가능성이 있으면 타입뒤에 ? 붙여야함

    var b: String?
    b = null // 가능!

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

fun translationFruitName(name: Any): String =
    when (name) {
        "apple" -> "사과"
        "banana" -> "바나나"
        "strawberry" -> "딸기"
        !is String -> "번역할 수 없습니다."
        else -> "몰?루"
    }
