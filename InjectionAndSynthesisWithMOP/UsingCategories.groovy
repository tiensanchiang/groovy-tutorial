#!/usr/bin/env groovy

class StringUtil{
    def static toSSN(self){
	if(self.size() == 9){
	    "${self[0..2]}-${self[3..4]}-${self[5..8]}"
	}
    }
}

@Category(String.class)
class StringCategory{
    def toSSN(){
	if(size() == 9){
	    "${this[0..2]}-${this[3..4]}-${this[5..8]}"
	}
    }
}

use(StringUtil){
    println "123456789".toSSN()
    println new StringBuilder("123456789").toSSN()
}

use(StringCategory){
    println "abcdefghi".toSSN()
}

try{
    "123456789".toSSN()
}catch(ex){
    println ex
}
