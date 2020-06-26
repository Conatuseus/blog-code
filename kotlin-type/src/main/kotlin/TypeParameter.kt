fun main() {

    // t가 null일 수 있으므로 안전한 호출을 해야한다.
    fun <T> printHashCode(t:T) {
        println(t?.hashCode())
    }

    // T는 널이 될 수 없는 타입이므로 안전한 호출을 할 필요가 없다.
    fun <T:Any> printHashCode(t:T) {
        println(t.hashCode())
    }
}