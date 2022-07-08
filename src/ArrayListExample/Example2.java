package ArrayListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2 {
//sorting string and integers
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Abishek");
		list.add("Sam");
		list.add("Ben");
		//sorting the list
		Collections.sort(list);
		//traversing
		for(String name:list)
			System.out.println(name);
		
		 System.out.println("Sorting numbers...");  
		  //Creating a list of numbers  
		  List<Integer> list2=new ArrayList<Integer>();  
		  list2.add(21);  
		  list2.add(11);  
		  list2.add(51);  
		  list2.add(1);  
		  //Sorting the list  
		  Collections.sort(list2);  
		   //Traversing list through the for-each loop  
		  for(Integer number:list2)  
		    System.out.println(number);  
		}
}
