package inheritanceandinterface;
//Interface
interface Converter {
 double gramsToKilograms(double grams);
 double kilogramsToGrams(double kilograms);
}

//Class implementing the Converter interface
class WeightConverter implements Converter {
 @Override
 public double gramsToKilograms(double grams) {
     return grams / 1000; // Convert grams to kilograms
 }

 @Override
 public double kilogramsToGrams(double kilograms) {
     return kilograms * 1000; // Convert kilograms to grams
 }
}
public class Interface {

	public static void main(String[] args) {
		WeightConverter converter = new WeightConverter();

        double grams = 1500; // Example weight in grams
        double kilograms = 1.5; // Example weight in kilograms

        // Convert grams to kilograms
        double kg = converter.gramsToKilograms(grams);
        System.out.println(grams + " grams is equal to " + kg + " kilograms.");

        // Convert kilograms to grams
        double g = converter.kilogramsToGrams(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + g + " grams.");

	}

}
