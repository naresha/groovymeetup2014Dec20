import groovy.transform.*

@Memoized
def costlyOp(number){
	println "performing op"
	number * 2
}


println costlyOp(2)
println costlyOp(2)
println costlyOp(3)