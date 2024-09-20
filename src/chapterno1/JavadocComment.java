package chapterno1;

/**
 * This class demonstrates the use of Javadoc comments.
 */

public class JavadocComment {
	/**
     * This method returns the square of a number.
     * @param number the number to be squared
     * @return the square of the number
     */
    public static int square(int number) {
        return number * number;
    }


	public static void main(String[] args) {
		
		int num = 5;
        System.out.println("The square of " + num + " is: " + square(num));
	}

}
