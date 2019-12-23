#!/usr/bin/env groovy

def printClassInfo(obj){
    println "class: ${obj.getClass().name}"
    println "superclass: ${obj.getClass().superclass.name}"
}

val = 125
printClassInfo("The stock closed at ${val}")
printClassInfo(/The stock closed at ${val}/)
printClassInfo('The stock closed at ${val}')
printClassInfo("The Stock closed at 125")
    
