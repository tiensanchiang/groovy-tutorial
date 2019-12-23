class Car{
	def miles
	def final year

	Car(theYear){
		year = theYear
	}
}


Car car = new Car(2018)

println "Year: $car.year"
println "Miles: $car.miles"

println "setting miles"
car.miles = 25
println "Miles: $car.miles"

car.year = 2019
