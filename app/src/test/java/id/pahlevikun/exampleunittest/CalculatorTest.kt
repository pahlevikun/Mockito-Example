package id.pahlevikun.exampleunittest

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.runners.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {

    @Mock
    private val serviceCalculator: CalculatorInterface? = null

    // object to test
    private var myCalculator: Calculator? = null

    private val num1 = 10
    private val num2 = 5

    @Before
    fun setUp() {
        myCalculator = Calculator()
        myCalculator!!.serviceCalculator = serviceCalculator
        myCalculator!!.num1 = num1
        myCalculator!!.num2 = num2
    }

    @Test
    fun addTest_shouldCorrect() {
        // mock the behaviour of service calculator
        `when`(serviceCalculator!!.add(num1, num2)).thenReturn(15)
        assertEquals("Result should be 15", 15, myCalculator!!.add())
    }

    @Test
    fun substractTest_shouldCorrect() {
        // mock the behaviour of service calculator
        `when`(serviceCalculator!!.substract(num1, num2)).thenReturn(5)
        assertEquals("Result should be 5", 5, myCalculator!!.substract())
    }

    @Test
    fun multiplyTest_shouldCorrect() {
        // mock the behaviour of service calculator
        `when`(serviceCalculator!!.multiply(num1, num2)).thenReturn(50)
        assertEquals("Result should be 50", 50, myCalculator!!.multiply())
    }

    @Test
    fun divideTest_shouldCorrect() {
        // mock the behaviour of service calculator
        `when`(serviceCalculator!!.divide(num1, num2)).thenReturn(2)
        assertEquals("Result should be 2", 2, myCalculator!!.divide())
    }
}