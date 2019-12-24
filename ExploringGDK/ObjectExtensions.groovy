#!/usr/bin/env groovy

str = 'hello'
println str
println str.dump()


class Person{
    def firstName;
    def lastName;
}

println new Person(firstName:"John", lastName:"Doe").dump()
