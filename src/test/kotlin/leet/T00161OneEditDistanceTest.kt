package leet

import com.inar.leet.T00161OneEditDistance
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class T00161OneEditDistanceTest {
    private val solution = T00161OneEditDistance.Solution()


    @ParameterizedTest
    @MethodSource("getData")
    fun oneInsert(s1: String, s2: String, expected: Boolean) {
        val result = solution.isOneEditDistance(s1, s2)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun getData(): List<Arguments> {
            return listOf(
                Arguments.of("ab", "acb", true),
                Arguments.of("cab", "ad", false),
                Arguments.of("1234", "1294", true)
            )
        }
    }
}