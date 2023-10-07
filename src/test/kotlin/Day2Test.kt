import org.junit.jupiter.api.Test

class Day2Test {

    private val array1 = arrayOf(1, 2, 3, 4, 5)
    private val result1 = arrayOf(120, 60, 40, 30, 24)
    private val array2 = arrayOf(3, 2, 1)
    private val result2 = arrayOf(2, 3, 6)


    @Test
    fun test1() {
        result1.contentEquals(day2(array1))
    }

    @Test
    fun test2() {
        result2.contentEquals(day2(array2))
    }

    @Test
    fun test1Functional() {
        result1.contentEquals(day2Functional(array1))
    }

    @Test
    fun test2Functional() {
        result2.contentEquals(day2Functional(array2))
    }

}