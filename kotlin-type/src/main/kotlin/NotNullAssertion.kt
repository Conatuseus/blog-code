fun main() {
    
    val list = arrayListOf<String?>()

    fun isValid() = list[0] != null

    fun doSomething(){
        val value = list[0]!!
        // ...
    }

}