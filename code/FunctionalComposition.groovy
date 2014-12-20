def values = [ 3, 5, 2, 1]

def addOne = { numbers ->
	numbers.collect{ it + 1 }
}

def doubler = { numbers ->
	numbers.collect { it * 2 }
}

def oneMoreThanDouble = addOne << doubler
println oneMoreThanDouble(values)
println values
