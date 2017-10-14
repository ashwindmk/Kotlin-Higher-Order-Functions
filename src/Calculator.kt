class Calculator {
    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
}

fun main(args: Array<String>) {
    val calculator = Calculator()

    val addition = { a: Int, b: Int -> a + b }

    val subtraction = { a: Int, b: Int -> a - b }

    val multiplication = { a: Int, b: Int -> a * b }

    val division = { a: Int, b: Int ->
        if (b == 0) {
            -1
        } else {
            a / b
        }
    }

    val a = 10
    val b = 5

    println("addition: " + calculator.calculate(a, b, addition))

    println("subtraction: " + calculator.calculate(a, b, subtraction))

    println("multiplication: " + calculator.calculate(a, b, multiplication))

    println("division: " + calculator.calculate(a, b, division))
}