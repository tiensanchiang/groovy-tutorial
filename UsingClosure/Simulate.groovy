#!/usr/bin/env groovy

class Equipment{
    def calculator;
    Equipment(cal){
	calculator = cal
    }

    def simulate(){
	println "Running Simulation..."
	calculator()
    }
}

Equipment e1 = new Equipment( { println "Calulator 1" } )

def c = { println "Calculator 2" }
Equipment e2 = new Equipment(c)
Equipment e3 = new Equipment(c)

e1.simulate()
e2.simulate()
e3.simulate()
