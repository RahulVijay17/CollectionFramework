package HashMap;

import java.util.HashMap;
import java.util.Map;
	
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Rahul");
		hm.put(2, "Vijay");
		hm.put(3, "Raj");
		
		//iterating hashmap
		   System.out.println("Iterating Hashmap...");  

		 for(Map.Entry m: hm.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  		
	}

}
