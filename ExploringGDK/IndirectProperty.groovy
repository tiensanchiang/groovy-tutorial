#!/usr/bin/env groovy

class Car{
    int miles, fuelLevel
}

car = new Car(fuelLevel: 80, miles: 25)

properties = ['miles', 'fuelLevel']

properties.each { name->
    println "$name = ${car[name]}"
}

car[properties[1]] = 100
println "fuelLevel now is ${car.fuelLevel}"
