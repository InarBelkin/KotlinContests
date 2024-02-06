package leet

import com.inar.leet.T00140
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class T00140Test {
    private val solution = T00140.Solution()

    @Test
    fun catsDogs() {
        solution.wordBreak("catsanddog", listOf("cat", "cats", "and", "sand", "dog"))
    }
}