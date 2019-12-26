#!/usr/bin/env groovy

def printInfo(obj){
    prop = "bytes"
    method = "toUpperCase"

    println obj[prop]
    println obj."$prop"

    println obj."$method"()
    println obj.invokeMethod(method, null)
}

printInfo("hello")

println "----------------------------------------------------"


println "Properties of 'hello' are:"
"hello ${new Object()}".properties.each { println "$it " }
