#!/usr/bin/env groovy

Integer.metaClass.getDaysFromNow = {
    Calendar today = Calendar.instance
    today.add(Calendar.DAY_OF_MONTH, delegate)
    today.time
}

println 5.getDaysFromNow()
println 3.daysFromNow


Integer.metaClass.'static'.isEven = { val->
    val%2==0
}

println "Is 2 even? ${Integer.isEven(2)}"
println "Is 3 even? ${Integer.isEven(3)}"


Integer.metaClass.constructor << { Calendar cal->
    new Integer(cal.get(Calendar.DAY_OF_YEAR))
}

println new Integer(Calendar.instance)
