package inheritanceandinterface;
//Interface
interface LengthConverter {
 double centimetersToMeters(double centimeters);
 double metersToCentimeters(double meters);
}

//Abstract class implementing the LengthConverter interface partially
abstract class Length implements LengthConverter {
 // The centimetersToMeters method is abstract and needs to be implemented by subclasses
 @Override
 public abstract double centimetersToMeters(double centimeters);

 // Providing a concrete implementation for the metersToCentimeters method
 @Override
 public double metersToCentimeters(double meters) {
     return meters * 100; // Convert meters to centimeters
 }
}

//Class LengthConverterImpl extending the abstract class
class LengthConverterImpl extends Length {
 @Override
 public double centimetersToMeters(double centimeters) {
     return centimeters / 100; // Convert centimeters to meters
 }
}
public class PartialImplementation {

	public static void main(String[] args) {
		LengthConverterImpl converter = new LengthConverterImpl();

        double centimeters = 150; // Example length in centimeters
        double meters = 1.5;      // Example length in meters

        // Convert centimeters to meters
        double m = converter.centimetersToMeters(centimeters);
        System.out.println(centimeters + " centimeters is equal to " + m + " meters.");

        // Convert meters to centimeters
        double cm = converter.metersToCentimeters(meters);
        System.out.println(meters + " meters is equal to " + cm + " centimeters.");

	}

}
