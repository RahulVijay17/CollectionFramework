package LinkedHashMap;
//Key-Value pair
import java.util.LinkedHashMap;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
	      map.put(100,"Amit");    
	     map.put(101,"Vijay");    
	     map.put(102,"Rahul");    
	       //Fetching key  
	       System.out.println("Keys: "+map.keySet());  
	       //Fetching value  
	       System.out.println("Values: "+map.values());  
	       //Fetching key-value pair  
	       System.out.println("Key-Value pairs: "+map.entrySet());  
	}

}
