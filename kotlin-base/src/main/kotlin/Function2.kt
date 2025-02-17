// 단일 표현식 함수

fun main() {
    print(add2(1, 2, 3))
}

// int a, b, c를 더하므로 반환형 타입이 int라 추론 가능
fun add2(a: Int, b: Int, c: Int) = a + b + c