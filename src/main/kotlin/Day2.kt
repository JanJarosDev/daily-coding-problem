/*

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?

*/

fun day2(array: Array<Int>): Array<Int> {
    val n = array.size
    val result = IntArray(n)
    var product = 1
    for (i in 0 until n) {
        result[i] = product
        product *= array[i]
    }
    product = 1
    for (i in (n - 1) downTo 0) {
        result[i] *= product
        product *= array[i]
    }
    return result.toTypedArray()
}

fun day2Functional(array: Array<Int>): Array<Int> {
    val productBefore = array.mapIndexed { index, _ ->
        array.take(index).fold(1) { acc, element -> acc * element }
    }
    val productAfter = array.mapIndexed { index, _ ->
        array.drop(index + 1).fold(1) { acc, element -> acc * element }
    }
    return productBefore.zip(productAfter) { before, after -> before * after }.toTypedArray()
}