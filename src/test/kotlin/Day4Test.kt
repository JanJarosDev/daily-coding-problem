import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day4Test {

    private val array1 = arrayOf(3, 4, -1, 1)
    private val expectedResult1 = 2
    private val array2 = arrayOf(1, 2, 0)
    private val expectedResult2 = 3

    @Test
    fun test1() {
        assertEquals(expectedResult1, day4(array1))
    }

    @Test
    fun test1Functional() {
        assertEquals(expectedResult1, day4Functional(array1))
    }

    @Test
    fun test2() {
        assertEquals(expectedResult2, day4(array2))
    }

    @Test
    fun test2Functional() {
        assertEquals(expectedResult2, day4Functional(array2))
    }
}