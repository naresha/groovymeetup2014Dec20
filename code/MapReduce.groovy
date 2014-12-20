
def values = [ 3, 5, 2, 1, 4]

def doubler = { it * 2}
def addOne = { it + 1}
List.metaClass.addNumbers = { 
	delegate.inject(0){ sum, num ->
		sum + num
	}
}


println values
	.findAll { it % 2 == 0 }
	.collect { doubler(it) }
	.addNumbers()
