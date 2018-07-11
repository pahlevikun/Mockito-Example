package id.pahlevikun.exampleunittest

class Calculator {

    var serviceCalculator: CalculatorInterface? = null

    var num1: Int = 0
    var num2: Int = 0

    fun add(): Int {
        return serviceCalculator!!.add(num1, num2)
    }

    fun substract(): Int {
        return serviceCalculator!!.substract(num1, num2)
    }

    fun multiply(): Int {
        return serviceCalculator!!.multiply(num1, num2)
    }

    fun divide(): Int {
        return serviceCalculator!!.divide(num1, num2)
    }
}