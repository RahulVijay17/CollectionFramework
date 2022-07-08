package ArrayListExample;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Vijay");
		list.add("Raj");
		 //accessing the element  
		System.out.println("returning element " +list.get(2)); //it will return the 2nd element, because index starts from 0
		 //changing the element  
		list.set(2, "Naren");
//travesing the list using for each loop
		for(String s:list)
			System.out.println(s);

	}

}
