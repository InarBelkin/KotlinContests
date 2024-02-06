package sandboxes

import com.inar.sandboxes.Sample
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SampleTest {
    private val testSample: Sample = Sample()

    @Test
    fun sum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }

    @Test
    fun sum2() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }

    @Test
    fun concatLists() {
        val l1 = listOf(1, 2, 3)
        val l2 = listOf(4, 5, 6)
        val l3 = l1 + l2
        println(l3)
    }
}