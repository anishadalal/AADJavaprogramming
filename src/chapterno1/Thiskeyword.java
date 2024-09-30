package chapterno1;

public class Thiskeyword {
	// Instance variables
    private String name;
    private int age;

    // Constructor using 'this' keyword
    public Thiskeyword(String name, int age) {
        this.name = name; // Assigning the parameter 'name' to the instance variable 'name'
        this.age = age;   // Assigning the parameter 'age' to the instance variable 'age'
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // Main method to test the class
	public static void main(String[] args) {
		Thiskeyword person = new Thiskeyword("Anisha", 20); // Create a new Person object
        person.displayDetails(); // Call the display method

	}

}
