/*

This problem was asked by Google.

Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class

class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
The following test should pass:

node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'

*/

class Node(var value: Any, var left: Node? = null, var right: Node? = null)

const val NULL = "null"
const val COMMA = ","

fun day3Serialize(root: Node?): String {
    val result = StringBuilder()
    serializeHelper(root, result)
    return result.toString()
}

fun day3Deserialize(s: String?): Node? {
    val tokens = s?.split(COMMA)?.toMutableList()
    return deserializeHelper(tokens)
}

private fun serializeHelper(node: Node?, result: StringBuilder) {
    if (node == null) {
        result.append(NULL)
        return
    }
    result.append(node.value).append(COMMA)
    serializeHelper(node.left, result)
    serializeHelper(node.right, result)
}

fun deserializeHelper(tokens: MutableList<String>?): Node? {
    if (tokens.isNullOrEmpty()) {
        return null
    }
    val currentToken = tokens.removeAt(0)
    if (currentToken == NULL) {
        return null
    }
    val node = Node(currentToken)
    node.left = deserializeHelper(tokens)
    node.right = deserializeHelper(tokens)
    return node
}