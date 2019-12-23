#!/usr/bin/env groovy

def factorial

factorial = {
    number, BigInteger theFactorial->
    number==1?theFactorial:factorial.trampoline(number-1,number * theFactorial)
}.trampoline()


println "factorial of 5 is: ${factorial(5,1)}"
println "Number of bits in the result factorial(5000) is ${factorial(5000,1).bitCount()}"

