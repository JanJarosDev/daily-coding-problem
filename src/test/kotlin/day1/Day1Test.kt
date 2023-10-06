package day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day1Test {

    private val array = arrayOf(10, 15, 3, 7)
    private val k = 17
    private val result = true

    @Test
    fun test() {
        assertEquals(result, day1(array, k))
        assertEquals(result, day1Functional(array, k))
    }

    @Test
    fun testFunctional() {
        assertEquals(result, day1Functional(array, k))
    }

}