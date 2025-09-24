//Abstraction
package Person;
abstract class Person{
	protected String name;
	Person(String name){
		this.name=name;
	}
	abstract String getDetails();
}
