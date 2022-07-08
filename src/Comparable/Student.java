package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable <Student> {
	
	int rollno;
	String name;
	int age;
	

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	

	@Override
	public int compareTo(Student st) 
	{
		if (age==st.age)
		// TODO Auto-generated method stub
		return 0;
		else if (age > st.age) //for age in reverse order use < symbol
			return 1;
		else
			return -1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  

		Collections.sort(al);
		for(Student st : al)
		{
			System.out.println(st.rollno+" " + st.name + " " + st.age);
		}

	}
}
