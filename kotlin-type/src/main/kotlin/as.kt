fun main() {

    class Person(val name: String, val age: Int) {
        override fun equals(other: Any?): Boolean {
            val otherPerson = other as? Person ?: return false
            return this.name == otherPerson.name
                    && this.age == otherPerson.age
        }

        override fun hashCode(): Int {
            var result = name.hashCode()
            result = 31 * result + age
            return result
        }
    }
}