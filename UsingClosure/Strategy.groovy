#!/usr/bin/env groovy

def totalSelectValues(n, closure){
    total = 0
    for( i in 1..n ){
	if(closure(i)) { total +=i }
    }

    total
}

print "Total of even number from 1 to 10 is:"
println totalSelectValues(10) { it % 2 == 0 }

def odd = { it % 2 != 0 }
print "Total of odd number from 1 to 10 is:"
println totalSelectValues(10, odd)
