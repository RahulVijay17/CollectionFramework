package HashMap;

import java.util.HashMap;
import java.util.Map;

//No Duplicate Key on HashMap.You cannot store duplicate keys in HashMap. 
//However, if you try to store duplicate key with another value, 
//it will replace the value.
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(1,"Grapes"); //trying duplicate key  
		   
		   //traversing
		   for(Map.Entry m : map.entrySet())
		   {
			   System.out.println(m.getKey()+" "+m.getValue());
		   }
	}

}
