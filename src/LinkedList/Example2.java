package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        //Traversing the list of elements in reverse order  
        Iterator<String> i=ll.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
	}

}
