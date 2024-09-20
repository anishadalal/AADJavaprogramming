package chapterno1;

public class ParameterizedConstructor {
	private int id;
	private String name;
	public ParameterizedConstructor(int i, String n) //creating a parameterized constructor
	{
	id = i;
	name = n;
	}
	public void display () //method to display the values
	{
	System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		//creating objects and passing values
		ParameterizedConstructor s1 = new ParameterizedConstructor(111,"Anisha");
		ParameterizedConstructor s2 = new ParameterizedConstructor(222,"Abantika");
		//calling method to display the values of object
		s1.display();
		s2.display();

	}

}
