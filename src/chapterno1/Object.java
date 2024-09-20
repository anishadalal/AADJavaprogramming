package chapterno1;

public class Object {
	// Instance variables
    private String name;
    private int age;

    // Constructor
    public Object (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
// Main method to test the class
	public static void main(String[] args) {
		// Creating an object of the Person class
		Object  person = new Object("Anisha", 20);
        person.displayDetails(); // Call the display method

	}

}
