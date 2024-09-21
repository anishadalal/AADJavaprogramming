package inheritanceandinterface;
//Base class: Point
class Point {
 protected int x, y;

 // Default constructor
 public Point() {
     this.x = 0;
     this.y = 0;
 }

 // Parameterized constructor
 public Point(int x, int y) {
     this.x = x;
     this.y = y;
 }

 // Method to display Point details
 public void display() {
     System.out.println("Point Coordinates: (" + x + ", " + y + ")");
 }
}

//Subclass: ColorPoint
class ColorPoint extends Point {
 private String color;

 // Parameterized constructor
 public ColorPoint(int x, int y, String color) {
     super(x, y); // Calling the superclass (Point) constructor
     this.color = color;
 }

 // Overriding the display method
 @Override
 public void display() {
     System.out.println("ColorPoint Coordinates: (" + x + ", " + y + "), Color: " + color);
 }
}

//Subclass: Point3D
class Point3D extends Point {
 private int z;

 // Parameterized constructor
 public Point3D(int x, int y, int z) {
     super(x, y); // Calling the superclass (Point) constructor
     this.z = z;
 }

 // Overriding the display method
 @Override
 public void display() {
     System.out.println("Point3D Coordinates: (" + x + ", " + y + ", " + z + ")");
 }
}

//Main class to test the functionality
public class Main {

	public static void main(String[] args) {
		 // Creating Point object
        Point point = new Point(5, 10);
        point.display();

        // Creating ColorPoint object
        ColorPoint colorPoint = new ColorPoint(7, 14, "Blue");
        colorPoint.display();

        // Creating Point3D object
        Point3D point3D = new Point3D(2, 4, 6);
        point3D.display();

	}

}
