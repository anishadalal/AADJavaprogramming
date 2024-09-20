package chapterno1;

public class CommandLineArguments {

	public static void main(String[] args) {
		// Check if any arguments are passed
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments were passed.");
        }

	}

}
