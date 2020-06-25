fun main() {

    fun verifyUserInput(input: String?) {
        // input?.isNullOrBlank() 이렇게 안전한 호출을 할 필요가 없다.
        if (input.isNullOrBlank()) {
            println("User Input Error")
        }
        // ...
    }
}