package chapterno1;
//Class representing a Car
class Car {
 private String make;
 private String model;
 private int year;

 // Constructor with three parameters
 public Car(String make, String model, int year) {
     this.make = make;
     this.model = model;
     this.year = year;
 }

 // Constructor with two parameters (nested constructor)
 public Car(String make, String model) {
     this(make, model, 2022); // Calls the three-parameter constructor with a default year
 }

 // Method to display car details
 public void displayDetails() {
     System.out.println("Car Make: " + make);
     System.out.println("Car Model: " + model);
     System.out.println("Car Year: " + year);
 }
}
//Main class
public class NestedConstructor {
	public static void main(String[] args) {
	     // Create instances of the Car class
	     Car car1 = new Car("Toyota", "Camry", 2020);
	     Car car2 = new Car("Honda", "Civic"); // Year will default to 2022

	     // Display car details
	     System.out.println("Car Details:");
	     car1.displayDetails();
	     System.out.println(); // Print a blank line
	     car2.displayDetails();
	 }
}


