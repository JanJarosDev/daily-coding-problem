import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day7Test {

    private val message = "111"
    private val expectedResult = 3

    @Test
    fun test() {
        assertEquals(expectedResult, day7(message))
    }
}