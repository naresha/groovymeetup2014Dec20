import groovy.transform.*

@Immutable
class Address{
	String city
}

@Immutable
class Person{
	String name
	int age
	Address address
}

def p = new Person(name: 'Mark', age: 25,
 address: new Address(city: 'BLR'))
println p.dump()
// p.age = 30 thows Error

def numbers = [ 3, 5, 2, 1]
def nums = numbers.asImmutable()
nums << 10
println numbers.sort(false)
println numbers
