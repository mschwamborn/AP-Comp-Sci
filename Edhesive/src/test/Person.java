package test;

public class Person {

	public String firstName;
	public String lastName;
	public Person() {
		this("John", "Doe");
	}
	public Person(String fname, String lname){
		firstName = fname;
		lastName = lname;
		
	}
	
	public String toString() {
		return lastName+", "+firstName;
	}
}