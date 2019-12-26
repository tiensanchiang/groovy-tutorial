#!/usr/bin/env groovy
class Friend{

    def listen(){
	println "$name is listening as a friend"
    }
}

@Mixin(Friend)
class Person {
    def firstName;
    def lastName;
    def getName(){
	"$firstName $lastName"
    }
    
    def listen(){
	println "person listening..."
    }
}


def p = new Person(firstName:"John", lastName:"Doe")
p.listen()
	

class Dog{
    def name
}

Dog.mixin Friend
def d = new Dog(name: "Buddy")
d.listen()

class Cat{
    def name
}


def c = new Cat(name: "Socks")

try{
    c.listen();
}catch(ex){
    println ex.message
}

c.metaClass.mixin(Friend)
c.listen()
