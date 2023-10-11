/*

This problem was asked by Jane Street.

cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

Given this implementation of cons:

def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair

Implement car and cdr.

*/

fun cons(a: Any, b: Any): Pair<Any, Any> {
    return Pair(a, b)
}

fun day5Car(pair: Pair<Any, Any>): Any {
    return pair.first
}

fun day5Cdr(pair: Pair<Any, Any>): Any {
    return pair.second
}