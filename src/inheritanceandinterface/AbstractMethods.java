package inheritanceandinterface;
//Abstract class
abstract class Species {
 // Abstract method (no body)
 abstract void describe();

 // Regular method
 void habitat() {
     System.out.println("This species has a specific habitat.");
 }
}

//Subclass Mammal
class Mammal extends Species {
 // Implementation of the abstract method
 @Override
 void describe() {
     System.out.println("This is a mammal, characterized by warm-bloodedness and hair or fur.");
 }
}

//Subclass Insect
class Insect extends Species {
 // Implementation of the abstract method
 @Override
 void describe() {
     System.out.println("This is an insect, characterized by a three-part body.");
 }
}


public class AbstractMethods {

	public static void main(String[] args) {
		Species mammal = new Mammal();  // Creating a Mammal object
        Species insect = new Insect();    // Creating an Insect object

        mammal.describe();  // Calls the Mammal's describe method
        insect.describe();   // Calls the Insect's describe method
        mammal.habitat();   // Calls the habitat method from Species
        insect.habitat();    // Calls the habitat method from Species
	}

}
