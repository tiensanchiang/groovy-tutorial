#!/usr/bin/env groovy

abstract class Writer{
    abstract void write(String message)
}

class StringWriter extends Writer{

    def target = new StringBuilder()

    void write(String message){
	target.append(message)
    }

    String toString(){
	target.toString()
    }
}


def writeStuff(writer){
    writer.write("This is stupid")
    println writer
}


def create(theWriter, Object[] filters = []){
    def writer = theWriter.newInstance()
    filters.each { writer.metaClass.mixin it}
    writer
}

writeStuff(create(StringWriter))

Object.metaClass.invokeOnPreviousMixin = {
    MetaClass currentMixinMetaClass, String method, Object [] args ->
    def previousMixin = delegate.getClass()
    for(mixin in mixedIn.mixinClasses){
	if(mixin.mixinClass.theClass ==
	   currentMixinMetaClass.delegate.theClass) break
	previousMixin = mixin.mixinClass.theClass
    }
    mixedIn[previousMixin]."$method"(*args)
}

class UpperCaseFilter{
    void write(String message){
	def allUpper = message.toUpperCase()
	invokeOnPreviousMixin(metaClass,"write", allUpper)
    }
}

writeStuff(create(StringWriter, [ UpperCaseFilter ]))
