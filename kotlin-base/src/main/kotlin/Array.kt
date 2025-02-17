
fun main() {
    // int형으로 1 2 3 4 배열 생성
    var intArr:Array<Int> = arrayOf(1, 2, 3, 4)

    // type은 생략 가능
    var intArr2 = arrayOfNulls<Int>(5)

    // Any는 데이터 타입의 최상위(어느 데이터든 다 들어갈 수 있음)
    var anyArr : Array<Any> = arrayOf(1, "awd", 3.2, 4)

    println(intArr[0])
    println(intArr2[1])
    println(anyArr[1])
}