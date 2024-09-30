package chapterno1;

public class PublicAccessSpecifier {
	// Public instance variables
    public String model;
    public int year;

    // Constructor
    public PublicAccessSpecifier(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Public method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
    // Main method to test the class
	public static void main(String[] args) {
		PublicAccessSpecifier car = new PublicAccessSpecifier("Toyota Corolla", 2020); // Create a new Car object
        car.displayDetails(); // Call the display method

	}

}
