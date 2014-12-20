def b1 = { ->
	println "Hello"
}

def b2 = { ->
	println "Hi"
}

def executeCommands(commands){
	commands.each { it() }
}

executeCommands([b1, b2])
