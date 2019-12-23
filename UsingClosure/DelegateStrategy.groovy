#!/usr/bin/env groovy

class Person{
    def name
    def pretty = {"My name is $name"}
    String toString(){
	pretty()
    }
}

class Thing{
    String name
}

def outerPretty = { "My name is $name" }


def p = new Person(name : "Sarah")
def t = new Thing(name : "Teapot")

println p
p.pretty.delegate = t
println p

outerPretty.delegate = p
println outerPretty()
outerPretty.delegate = t
println outerPretty()
