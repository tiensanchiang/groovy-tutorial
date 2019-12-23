#!/usr/bin/env groovy

import groovy.transform.*

@Canonical(excludes="age")
class Person{
	String firstName
	String lastName
	int age
}


def sara = new Person(firstName: 'Sara', lastName: 'Walker', age: 49)
println sara
