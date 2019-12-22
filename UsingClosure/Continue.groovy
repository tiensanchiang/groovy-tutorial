#!/usr/bin/env groovy

def iterate(n, closure){
    1.upto(n) {
	println "In Iterate with value ${it}"
	closure(it)
    }
}


println "Calling iterate"
total = 0
iterate(4) {
    total += it
    println "In closure total so fa is $total"
}
println "Done"
