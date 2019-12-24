#!/usr/bin/env groovy

class Person{

    def walk(){ println "Walking..." }
    def walk(miles) { println "Walking $miles miles..." }
    def walk(miles, String where) { println "Walking $miles miles $where..."}

}

peter = new Person()

peter.invokeMethod("walk", null)
peter.invokeMethod("walk", 100)
peter.invokeMethod("walk", [100, 'NewYork'] as Object[])
