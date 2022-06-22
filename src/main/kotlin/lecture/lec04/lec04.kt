package lecture.lec04

fun main() {
    val money1 = Money(2000L)
    val money2 = Money(1000L)
    val money3 = Money(1000L)
    val money4 = money3

    if (money1 > money2) {
        println("money1이 더 큰 금액입니다.")
    }

    println(money2 == money3)
    println(money2 === money3)
    println(money3 === money4)
}
