package collectionframework;
//2)addAll
import java.util.Iterator;
public class Collection3 {
	static class Student {  // Make this class static
        int rollno;
        String name;
        int age;

        Student(int rollno, String name, int age) {
            this.rollno = rollno;
            this.name = name;
            this.age = age;
        }
    }

	public static void main(String[] args) {
		Student s1=new Student(101,"Sonoo",23); 
		Student s2=new Student(102,"Sima",24); 
		Student s3=new Student(103,"Sonal",25); 
		java.util.ArrayList<Student> al = new java.util.ArrayList<>(); 
		al.add(s1); 
		al.add(s2); 
		al.add(s3); 
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext()) { 
			Student st=itr.next(); 
		System.out.println(st.rollno + " " + st.name + " " + st.age);
	}

	}

}
