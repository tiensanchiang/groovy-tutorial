#!/usr/bin/env groovy

import groovy.transform.*

@Canonical
class Person{
	def firstName
	def lastName
	def age
}


@Newify([Person])
def fluentCreate(){
	Person p = Person(firstName:'John', lastName:'Doe', age: 28)
	println p
}

fluentCreate()
