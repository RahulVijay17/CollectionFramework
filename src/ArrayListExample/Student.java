package ArrayListExample;
import java.util.ArrayList;
import java.util.Iterator;

public class Student{
	String name;
	int age;
	int rollno;
	public Student(String name, int age, int rollno) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Creating user-defined class objects  

		Student student1 = new Student("Rahul",23,420);
		Student student2 = new Student("Vijay",23,421);
		Student student3 = new Student("raj",23,422);
		  //creating arraylist  

		ArrayList<Student> list = new ArrayList<Student>();
			list.add(student1);//adding Student class object  
			list.add(student3);
			list.add(student2);
		
			  //Getting Iterator  
			Iterator<Student> itr = list.iterator();
			//traversing 
			while(itr.hasNext()) {
				Student std = (Student)itr.next();
				System.out.println(std.name+" "+std.age+" "+std.rollno);
		
	}
}
}