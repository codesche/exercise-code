// when - switch 문이랑 비슷한 기능

fun main() {
    exWhen("awd")
    exWhen2(2)
}

fun exWhen(a: Any) {
    when(a) {
        1 -> print(a)
        "awd" -> print(a)
        else -> print(a)
    }
}

fun exWhen2(a: Any) {
    var b =
    when(a) {
        1 -> a
        "awd" -> a
        else -> a
    }
    print(b)
}