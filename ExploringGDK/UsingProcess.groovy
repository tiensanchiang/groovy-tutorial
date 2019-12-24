#!/usr/bin/env groovy

process = "wc".execute()

process.out.withWriter {
    it << "Let the World know...\n"
    it << "Groovy rocks!\n"
}

//println process.text
println process.in.text
