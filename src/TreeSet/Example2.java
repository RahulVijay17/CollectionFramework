package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;
//traversing elements in descending order.
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<String> set=new TreeSet<String>();  
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Ajay");  
         System.out.println("Traversing element through Iterator in descending order");  
         Iterator i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
           
	}

}
