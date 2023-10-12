/*

This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

*/

fun day7(message: String): Int {
    if (message.isEmpty() || message[0] == '0') return 0
    val n = message.length
    val dpArrayHolder = IntArray(n + 1)
    dpArrayHolder[0] = 1
    dpArrayHolder[1] = 1
    for (i in 2..n) {
        val oneDigit = message[i - 1] - '0'
        val twoDigits = (message[i - 2] - '0') * 10 + oneDigit
        if (oneDigit > 0) {
            dpArrayHolder[i] += dpArrayHolder[i - 1]
        }
        if (twoDigits in 10..26) {
            dpArrayHolder[i] += dpArrayHolder[i - 2]
        }
    }
    return dpArrayHolder[n]
}
