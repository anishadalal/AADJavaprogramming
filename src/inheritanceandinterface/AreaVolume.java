package inheritanceandinterface;
//Define the Operation interface
interface Operation {
 double area();   // Method to calculate area
 double volume(); // Method to calculate volume
 double PI = 3.142; // Constant PI
}

//Class to calculate area of a Round
class Round implements Operation {
 private double radius;

 // Constructor to initialize radius
 public Round(double radius) {
     this.radius = radius;
 }

 // Implementing area method for Round
 @Override
 public double area() {
     return PI * radius * radius; // Area of circle formula: πr²
 }

 // Volume method returns 0 for Round
 @Override
 public double volume() {
     return 0; // Round does not have volume
 }
}

//Class to calculate volume of a Cylinder
class Cylinder implements Operation {
 private double radius;
 private double height;

 // Constructor to initialize radius and height
 public Cylinder(double radius, double height) {
     this.radius = radius;
     this.height = height;
 }

 // Implementing area method for Cylinder (lateral surface area)
 @Override
 public double area() {
     return 2 * PI * radius * height + 2 * PI * radius * radius; // Surface area formula: 2πrh + 2πr²
 }

 // Implementing volume method for Cylinder
 @Override
 public double volume() {
     return PI * radius * radius * height; // Volume formula: πr²h
 }
}

//Main class to test the functionality
public class AreaVolume {

	public static void main(String[] args) {
		// Create a Round object
        Round round = new Round(5); // Example radius
        System.out.println("Round Area: " + round.area());
        System.out.println("Round Volume: " + round.volume());

        // Create a Cylinder object
        Cylinder cylinder = new Cylinder(5, 10); // Example radius and height
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());

	}

}
