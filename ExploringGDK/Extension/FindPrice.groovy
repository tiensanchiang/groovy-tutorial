#!/usr/bin/env groovy

def ticker = "ORCL"

println "Price for $ticker using instance method is ${String.getPrice(ticker)}"
