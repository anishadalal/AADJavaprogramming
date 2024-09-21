package collectionframework;

public class WrapperClass {

	public static void main(String[] args) {
		// Using wrapper classes for primitive types
        Integer intObj = Integer.valueOf(10);  // Boxing: primitive int to Integer object
        Double doubleObj = Double.valueOf(5.55);  // Boxing: primitive double to Double object
        Character charObj = Character.valueOf('A');  // Boxing: primitive char to Character object
        
        // Auto-boxing: automatic conversion of primitive to wrapper object
        Integer autoInt = 20;
        Double autoDouble = 10.75;
        Boolean autoBool = true;
        
        // Unboxing: converting wrapper object back to primitive
        int intPrimitive = intObj.intValue();
        double doublePrimitive = doubleObj.doubleValue();
        char charPrimitive = charObj.charValue();
        
        // Auto-unboxing: automatic conversion from wrapper object to primitive
        int autoUnboxInt = autoInt;
        double autoUnboxDouble = autoDouble;
        boolean autoUnboxBool = autoBool;
        
        // Displaying the values
        System.out.println("Boxing: ");
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        
        System.out.println("\nAuto-boxing: ");
        System.out.println("Auto-boxed Integer: " + autoInt);
        System.out.println("Auto-boxed Double: " + autoDouble);
        System.out.println("Auto-boxed Boolean: " + autoBool);
        
        System.out.println("\nUnboxing: ");
        System.out.println("Unboxed int: " + intPrimitive);
        System.out.println("Unboxed double: " + doublePrimitive);
        System.out.println("Unboxed char: " + charPrimitive);
        
        System.out.println("\nAuto-unboxing: ");
        System.out.println("Auto-unboxed int: " + autoUnboxInt);
        System.out.println("Auto-unboxed double: " + autoUnboxDouble);
        System.out.println("Auto-unboxed boolean: " + autoUnboxBool);

	}

}
