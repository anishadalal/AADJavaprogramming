package inheritanceandinterface;
// Superclass: Animal
class Animal {
    String name;

    // Superclass constructor
    Animal(String name) {
        this.name = name;
    }

    // Superclass method
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass: Dog (Inherits from Animal)
class Dog extends Animal {

    // Subclass constructor
    Dog(String name) {
        super(name);  // Call the superclass constructor
    }

    // Subclass method
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class SingleInheritance {

	public static void main(String[] args) {
		 // Creating an object of the Dog class
        Dog myDog = new Dog("Mintu");

        // Call methods from both superclass and subclass
        myDog.eat();   // Inherited method from Animal class
        myDog.bark();  // Method from Dog class

	}

}
