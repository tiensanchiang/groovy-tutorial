#!/usr/bin/env groovy

langs = [ 'C++' : 'Stroustrup', 'Java' : 'Gosling', 'Lisp' : 'McCarthy' ]

println langs.Java
println langs['C++']
println langs.'C++'

println langs.collect { key, value->
    key.replaceAll('[+]', 'P')
}
