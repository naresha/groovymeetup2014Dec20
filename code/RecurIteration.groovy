def values = [ 3, 5, 2, 1, 4, 1]

// println values.head()
// println values.tail()


def sumRec(numbers, sum = 0){
	!numbers.tail() ? sum + numbers.head() : numbers.head() + 
		sumRec(numbers.tail(), sum)
}

println sumRec(values)
// println values

def block = { sum, num ->
	sum + num
}

def addNumbers = { numbers ->
	numbers.inject(0, block)
}

println addNumbers(values)
// sample impl for understanding inject
/*
def inj = {vals, init, closure ->
	int sum  = init
	for( num in vals){
		sum = closure(sum, num) 
	}
	sum
}

println "---" + inj(values, 0, block)
*/






