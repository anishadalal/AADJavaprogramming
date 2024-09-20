package chapterno1;

public class ConcreteClass {
	// Instance variables
    private String model;
    private int year;

    // Constructor
    public ConcreteClass(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
// Main method to test the class
	public static void main(String[] args) {
		ConcreteClass car = new ConcreteClass("Honda Accord", 2022); // Create a new Car object
        car.displayDetails(); // Call the display method

	}

}
