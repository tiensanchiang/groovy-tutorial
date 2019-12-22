#!/usr/bin/env groovy

def pickEven(n, closure){
    for(i=1;i<=n;i++){
	closure(i)
    }
}


total = 0
println total
