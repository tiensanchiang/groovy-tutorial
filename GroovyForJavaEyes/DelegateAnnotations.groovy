#!/usr/bin/env groovy

import groovy.transform.*

class Worker{
	def work() { println "get work done" }
	def analyze() { println "analyze..." }
	def report() { println "get report written" }
}

class Expert{
	def analyze() { println "expert analyze..." }
}

class Manager{
	@Delegate Expert expert = new Expert()
	@Delegate Worker worker = new Worker()
}


Manager manager = new Manager()
manager.analyze()
manager.work()
manager.report()
