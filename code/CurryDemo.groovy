
def multiply = { number, times ->
	number * times
}

def number = 10
def doubler = multiply.rcurry(2)

def perform(op){
	def number  = 10
	op(10)
}

println perform(doubler)

//OOP Way
class Multiplier{
	
	int times
	
	def multiply(number){
		number * times
	}
}

def doublerOop = new Multiplier(times: 2)
println doublerOop.multiply(10)
// accidentally change the state !
doublerOop.times = 3
println doublerOop.multiply(10)

