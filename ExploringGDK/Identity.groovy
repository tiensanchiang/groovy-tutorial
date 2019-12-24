#!/usr/bin/env groovy

lst = [1,2,3,4]
lst.with {
    add(3)
    add(4)
    println size()
    println contains(2)
}

println "-----------------------------------------"

lst.with {
    println "this is: $this"
    println "owner is: $owner"
    println "delegate is: $delegate"
}
