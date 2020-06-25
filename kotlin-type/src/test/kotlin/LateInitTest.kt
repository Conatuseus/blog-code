import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MyServiceTest {

    private var myService:MyService? = null

    @BeforeEach
    fun setUp() {
        myService = MyService()
    }

    @Test
    fun test() {
        assertEquals("foo",myService!!.performAction())
    }
}