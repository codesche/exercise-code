
// 코틀린에서는 to변수()를 통해 형변환 가능
// 코틀린은 암시적 형변환을 지원하지 않음

fun main() {
    var a: Int = 123
    var b: String = a.toString()
    print(b)
}