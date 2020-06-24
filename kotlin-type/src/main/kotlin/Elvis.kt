fun main() {

    class Address(
        val streetAddress: String, val zipCode: Int,
        val city: String, val country: String
    )

    class Company(val name: String, val address: Address?)

    class Person(val name: String, val company: Company?)

    fun Person.countryName() = company?.address?.country ?: "Unknown"

}