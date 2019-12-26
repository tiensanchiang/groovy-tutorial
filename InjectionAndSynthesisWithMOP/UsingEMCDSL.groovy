#!/usr/bin/env groovy

Integer.metaClass {
    daysFromNow = { ->
	Calendar cal = Calendar.instance
	cal.add(Calendar.DAY_OF_MONTH, delegate)
	cal.time
    }

    getDaysFromNow = { ->
	Calendar cal = Calendar.instance
	cal.add(Calendar.DAY_OF_MONTH, delegate)
	cal.time
    }

    'static' {
	isEven = { val -> val % 2 == 0}
    }

    constructor = { Calendar cal->
	new Integer(cal.get(Calendar.DAY_OF_YEAR))
    }

    constructor = { int val->
	println "Intercepting constructor call..."
	constructor = Integer.class.getConstructor(Integer.TYPE)
	constructor.newInstance(val)
    }
}


println 5.daysFromNow()
println 3.daysFromNow
println "Is 3 even? ${Integer.isEven(3)}"
println "Is 2 even? ${Integer.isEven(2)}"
println new Integer(3)
println new Integer(Calendar.instance)
