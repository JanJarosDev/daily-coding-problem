/*

This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.

*/

fun day4(array: Array<Int>): Int {
    val n = array.size
    for (i in 0 until n) {
        while (array[i] in 1..n && array[i] != array[array[i] - 1]) {
            val temp = array[i]
            array[i] = array[array[i] - 1]
            array[temp - 1] = temp
        }
    }
    for (i in 0 until n) {
        if (array[i] != i + 1) {
            return i + 1
        }
    }
    return n + 1
}

fun day4Functional(array: Array<Int>): Int {
    val n = array.size
    val positiveNumbers = array.filter { it > 0 }.toSet()
    return (1..n + 1).find { it !in positiveNumbers } ?: (n + 1)
}