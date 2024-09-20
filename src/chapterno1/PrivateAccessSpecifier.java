package chapterno1;
public class PrivateAccessSpecifier {
//Private instance variables
private String name;
private int age;

// Constructor
public PrivateAccessSpecifier(String name, int age) {
    this.name = name;
    this.age = age;
}

// Public method to access private variable 'name'
public String getName() {
    return name;
}

// Public method to access private variable 'age'
public int getAge() {
    return age;
}
//Main method to test the class
	public static void main(String[] args) {
		PrivateAccessSpecifier person = new PrivateAccessSpecifier("Anisha", 20); // Create a new Person object
        System.out.println("Name: " + person.getName()); // Access private variable using getter
        System.out.println("Age: " + person.getAge());   // Access private variable using getter


	}

}
