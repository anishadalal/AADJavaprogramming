package inheritanceandinterface;
//Superclass: Flower
class Flower {
 String color;

 // Superclass constructor
 Flower(String color) {
     this.color = color;
 }

 // Superclass method
 void display() {
     System.out.println("This is a flower with color: " + color);
 }
}

//Subclass: Rose (Inherits from Flower)
class Rose extends Flower {

 // Subclass constructor
 Rose(String color) {
     super(color); // Call the superclass constructor
 }

 // Subclass method
 void smell() {
     System.out.println("Roses have a sweet smell.");
 }
}

public class Inheritance {

	public static void main(String[] args) {
		// Creating an object of the Rose class
        Rose myRose = new Rose("Red");

        // Call methods of superclass and subclass
        myRose.display();  // Inherited method from Flower class
        myRose.smell();    // Method from Rose class
	}

}
