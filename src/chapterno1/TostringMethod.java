package chapterno1;

public class TostringMethod {
	// Instance variables
    private String make;
    private String model;
    private int year;

    // Constructor
    public TostringMethod(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Override toString() method from Object class
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
    // Main method to test the class
	public static void main(String[] args) {
		Car car = new Car("Toyota", "Camry", 2022);
        
        // Displaying the car details using toString()
        System.out.println(car);

	}

}
