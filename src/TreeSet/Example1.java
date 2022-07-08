package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

//Java TreeSet class maintains ascending order.
public class Example1 {

	public static void main(String[] a) {
		//Creating and adding elements  
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
}
