#!/usr/bin/env groovy

import groovy.transform.*

class Heavy{
	def size = 10
	Heavy() { println "Create Heavy with $size" }
}

class AsNeeded{
	def value
	@Lazy Heavy heavy1 = new Heavy()
	@Lazy Heavy heavy2 = {new Heavy(size: value)}()

	AsNeeded() { println "Create AsNeeded" }
}

AsNeeded asNeeded = new AsNeeded(value: 1000);
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size
