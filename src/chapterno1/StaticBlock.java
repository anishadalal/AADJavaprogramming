package chapterno1;

public class StaticBlock {
	 //Static variable
	    private static int staticValue;

	    // Static block
	    static {
	        staticValue = 42; // Initialize the static variable
	        System.out.println("Static block is executed.");
	    }

	    // Method to display the static value
	    public void displayStaticValue() {
	        System.out.println("Static Value: " + staticValue);
	    }
	 // Main method to test the class
	public static void main(String[] args) {
		// Displaying the static value using an object
        StaticBlock demo = new StaticBlock();
        demo.displayStaticValue(); // Call the method to display the static value

	}

}
