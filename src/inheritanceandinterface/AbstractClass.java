package inheritanceandinterface;
//Abstract class
abstract class Bird {
 // Abstract method
 abstract void fly();

 // Concrete method
 void eat() {
     System.out.println("This bird eats seeds and insects.");
 }
}

//Subclass: Sparrow (Inherits from Bird)
class Sparrow extends Bird {
 @Override
 void fly() {
     System.out.println("Sparrow is flying high in the sky.");
 }
}

//Subclass: Penguin (Inherits from Bird)
class Penguin extends Bird {
 @Override
 void fly() {
     System.out.println("Penguins can't fly, but they are great swimmers.");
 }
}

public class AbstractClass {

	public static void main(String[] args) {
		// Create objects of Sparrow and Penguin classes
        Bird mySparrow = new Sparrow();
        Bird myPenguin = new Penguin();

        // Call the methods
        mySparrow.fly(); // Output: Sparrow is flying high in the sky.
        mySparrow.eat(); // Output: This bird eats seeds and insects.

        myPenguin.fly(); // Output: Penguins can't fly, but they are great swimmers.
        myPenguin.eat(); // Output: This bird eats seeds and insects.

	}

}
