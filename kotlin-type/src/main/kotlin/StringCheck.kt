class StringCheck {

    // 컴파일 에러
    // fun strLenUnsafe(str: String?) = str.length

    fun strLenSafe(str: String?) =
        if (str != null) str.length else 0
}

fun main() {
    val stringCheck = StringCheck()
    println(stringCheck.strLenSafe(null))
    println(stringCheck.strLenSafe("conas"))
    // 실행 결과
    // null
    // 5
}