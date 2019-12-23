#!/usr/bin/env groovy

import groovy.transform.*

@Singleton(lazy=true, strict=false)
class TheUnique{
	private TheUnique() { println 'Instance created' }
	def hello() { println 'hello' }
}


println 'Accessing TheUnique'

TheUnique.instance.hello()
TheUnique.instance.hello()
