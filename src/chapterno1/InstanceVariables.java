package chapterno1;

public class InstanceVariables {
	 private String color;  
	   private int speed;  
	  
	   // Constructor  
	   public InstanceVariables(String color, int speed) {  
	      this.color = color;  
	      this.speed = speed;  
	   }  
	  
	   // Method to display car details  
	   public void displayDetails() {  
	      System.out.println("Car Color: " + color);  
	      System.out.println("Car Speed: " + speed);  
	   }  
	
	public static void main(String[] args) {
		// Create two instances of Car  
		InstanceVariables car1 = new InstanceVariables("Red", 120);  
		InstanceVariables car2 = new InstanceVariables("Blue", 150);  
	  
	      // Display details of each car  
	      car1.displayDetails();  
	      car2.displayDetails(); 

	}

}
