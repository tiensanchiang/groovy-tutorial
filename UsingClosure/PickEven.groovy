#!/usr/bin/env groovy

def pickEven(n, block){
	for(i=0;i<n;i+=2)
		block(i)
}


pickEven(10,{ println "$it" })

pickEven(10) { println "$it" }

def pickEven2(block){
    for(i=0;i<10;i+=2)
	block(i)
}

pickEven2 { println "===>>$it" }

total = 0
pickEven(10) { total += it }
println "====>>$total"

product = 0
pickEven(10) { product *= it }
println "====>>$product"
