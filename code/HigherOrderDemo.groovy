
def perform(operation){
	int number1 = 10
	int number2 = 20
	operation(10,20)
}



def getOperation(String symbol){
	def add = { a, b ->
		a + b
	}

	def subtract = {a, b ->
		a - b
	}
	
	switch(symbol){
		case '+':
			return add
			break
		case '-':
			return subtract
			break
		default:
			throw new IllegalArgumentException()
	}
}
def op = getOperation('-')
println perform(op)

