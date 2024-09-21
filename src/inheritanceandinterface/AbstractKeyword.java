package inheritanceandinterface;
//Abstract class
abstract class Food {
 // Abstract method
 public abstract void prepare();
}

//Subclass Pizza that extends Food
class Pizza extends Food {
 @Override
 public void prepare() {
     System.out.println("Preparing a delicious pizza with cheese and toppings!");
 }
}

//Subclass Salad that extends Food
class Salad extends Food {
 @Override
 public void prepare() {
     System.out.println("Preparing a fresh salad with vegetables and dressing!");
 }
}
public class AbstractKeyword {

	public static void main(String[] args) {
		// Creating objects of Pizza and Salad
        Food pizza = new Pizza();
        Food salad = new Salad();

        // Calling the prepare method
        pizza.prepare(); // Output: Preparing a delicious pizza with cheese and toppings!
        salad.prepare(); // Output: Preparing a fresh salad with vegetables and dressing!

	}

}
