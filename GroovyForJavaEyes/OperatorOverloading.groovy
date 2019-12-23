#!/usr/bin/env groovy

class ComplexNumber{
	def real, imaginary

	def plus(other){
		new ComplexNumber(real: real + other.real,
			imaginary: imaginary + other.imaginary)
	}

	String toString(){
		"$real ${imaginary>0?'+':''} ${imaginary}i"
	}
}

c1 = new ComplexNumber(real:1, imaginary: 4)
c2 = new ComplexNumber(real:2, imaginary: 8)

println c1 + c2
