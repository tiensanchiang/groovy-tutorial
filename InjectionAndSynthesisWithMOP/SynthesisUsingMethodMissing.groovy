#!/usr/bin/env groovy


class Person{
    def work(){
	"Working...."
    }

    def plays = [ 'Tennis', 'VolleyBall', 'BasketBall' ]

    def methodMissing(String name, args){
	System.out.println "methodMissing called for $name"

	def methodInList = plays.find { it == name.split('play')[1] }
	if(methodInList){
	    "playing ${name.split('play')[1]}..."
	}else{
	    throw new MissingMethodException(name, Person.class,args)
	}
    }
}

jack = new Person()
println jack.work()
println jack.playTennis()
println jack.playVolleyBall()
println jack.playBasketBall()

try{
    println jack.playFootBall()
}catch(ex){
    println ex
}
