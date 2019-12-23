#!/usr/bin/env groovy

matcher = "Groovy is groovy" =~ /(G|g)roovy/
print "Size of matcher is ${matcher.size()}"
println "with elements ${matcher[0]} and ${matcher[1]}"

str = "Groovy is groovy, very groovy"
println str
result = (str =~ /groovy/).replaceAll('hip')
println result
