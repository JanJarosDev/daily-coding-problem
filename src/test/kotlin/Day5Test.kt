import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day5Test {

    private val firstValue = 3
    private val secondValue = 4

    @Test
    fun testCar() {
        assertEquals(firstValue, day5Car(cons(firstValue, secondValue)))
    }

    @Test
    fun testCdr() {
        assertEquals(secondValue, day5Cdr(cons(firstValue, secondValue)))
    }
}