#!/usr/bin/env groovy

lst = ['Programming', 'In', 'Groovy']
println lst

lst[0] = ['Be', 'Productive']
println lst

println lst.flatten()

println lst.size()
println lst*.size()
println lst.flatten()*.size()

def words(a,b,c,d){
    println "==>>$a $b $c $d<<=="
}

words(*lst.flatten())
