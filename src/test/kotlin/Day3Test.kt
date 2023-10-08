import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day3Test {

    private val testNode = Node(
        value = "root",
        left = Node(
            value = "left",
            left = Node("left.left"),
        ),
        right = Node(value = "right"),
    )

    @Test
    fun testDay3SerializeDeserialize() {
        val serialized = day3Serialize(testNode)
        val deserialized = day3Deserialize(serialized)
        assertEquals("left.left", deserialized?.left?.left?.value)
    }
}