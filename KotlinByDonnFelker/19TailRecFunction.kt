package KotlinByDonnFelker

import java.math.BigInteger

fun main() {

    println(fibonacciSeries(10000, BigInteger("1"), BigInteger("0")))
}

// without tailrec this will Out of Memory
tailrec fun fibonacciSeries(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n == 0) return b
    else return fibonacciSeries(n - 1, a + b, a)
}

