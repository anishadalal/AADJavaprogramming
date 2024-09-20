package chapterno1;

public class FinalizeMethod {
	protected void finalize() throws Throwable {
	    try {
	      System.out.println("Inside finalize method of Demo Class.");
	    } 
	    catch (Throwable e) {
	      throw e;
	    } 
	    finally {
	      System.out.println("Calling finalize method of the Object class");

	    }
	  }

	public static void main(String[] args) throws Throwable {
		// Creating demo's object
		FinalizeMethod d = new FinalizeMethod();

	    // Calling finalize of demo
	    d.finalize();

	}

}
