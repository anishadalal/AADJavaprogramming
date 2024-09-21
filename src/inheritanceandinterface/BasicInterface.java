package inheritanceandinterface;
//Interface
interface Chocolate {
 void taste(); // Method signature
}

//Class DarkChocolate implementing the Chocolate interface
class DarkChocolate implements Chocolate {
 @Override
 public void taste() {
     System.out.println("Dark Chocolate: Rich and slightly bitter.");
 }
}

//Class MilkChocolate implementing the Chocolate interface
class MilkChocolate implements Chocolate {
 @Override
 public void taste() {
     System.out.println("Milk Chocolate: Sweet and creamy.");
 }
}

public class BasicInterface {

	public static void main(String[] args) {
		// Creating objects of DarkChocolate and MilkChocolate
        Chocolate darkChocolate = new DarkChocolate();
        Chocolate milkChocolate = new MilkChocolate();

        // Calling the taste method
        darkChocolate.taste(); // Output: Dark Chocolate: Rich and slightly bitter.
        milkChocolate.taste(); // Output: Milk Chocolate: Sweet and creamy.

	}

}
