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
}