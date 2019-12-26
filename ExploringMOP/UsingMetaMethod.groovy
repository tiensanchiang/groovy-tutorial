#!/usr/bin/env groovy

str = "Hello"
methodName = "toUpperCase"

methodOfInterest = str.metaClass.getMetaMethod(methodName)

println methodOfInterest.invoke(str)
