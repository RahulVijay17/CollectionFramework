package ArrayListExample;

import java.util.ArrayList;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java ArrayList example of isEmpty() method
		  ArrayList<String> al=new ArrayList<String>();  
          System.out.println("Is ArrayList Empty: "+al.isEmpty());  
          al.add("Ravi");    
          al.add("Vijay");    
          al.add("Ajay");    
          System.out.println("After Insertion");  
          System.out.println("Is ArrayList Empty: "+al.isEmpty());   
	}

}
