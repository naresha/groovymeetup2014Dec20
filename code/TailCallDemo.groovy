import groovy.transform.*
/*

def fact(number){
	number == 0 ? 1 :  number * fact(number - 1)
}

*/

@TailRecursive
def factorial(number, fact = 1){
	number == 0 ? fact : factorial(number-1, fact*number) 
}
println factorial(20000G)


