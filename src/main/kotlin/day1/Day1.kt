package day1

/*

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

*/

fun day1(array: Array<Int>, k: Int): Boolean {
    val possibilities = HashSet<Int>()
    for (item in array) {
        if (possibilities.contains(item)) {
            return true
        }
        possibilities.add(k - item)
    }
    return false
}

fun day1Functional(array: Array<Int>, k: Int): Boolean =
    array.fold(setOf<Int>()) { possibilities, item ->
        if (possibilities.contains(item)) {
            return true
        }
        possibilities + (k - item)
    }.isNotEmpty()