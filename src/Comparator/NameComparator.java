package Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) 
	{
		// TODO Auto-generated method stub
		return st1.name.compareTo(st2.name);
	}

}
