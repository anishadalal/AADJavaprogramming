package inheritanceandinterface;
//Superclass (ParentClass)
class ParentClass {
 // Method to be overridden in the subclass
 public void displayMessage() {
     System.out.println("Message from ParentClass");
 }
}

//Subclass (ChildClass) that extends the ParentClass
class ChildClass extends ParentClass {
 // Overriding the displayMessage() method of ParentClass
 @Override
 public void displayMessage() {
     System.out.println("Message from ChildClass");
 }
}

public class InheritanceWithOverridingMethods {

	public static void main(String[] args) {
		 // Creating an object of the ChildClass
        ChildClass child = new ChildClass();
        child.displayMessage(); // This will call the overridden method in ChildClass

        // Creating an object of the ParentClass
        ParentClass parent = new ParentClass();
        parent.displayMessage(); // This will call the method in ParentClass

	}

}
