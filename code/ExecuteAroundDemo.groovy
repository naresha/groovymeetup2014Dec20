def b1 = { ->
	println "Hello"
}

def b2 = { ->
	println "Hi"
}

def executeCommand(command){
	println "Before Command"
	command()
	println "After command"
}

executeCommand(b1)
executeCommand(b2)


