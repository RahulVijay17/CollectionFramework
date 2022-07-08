package TreeSet;
//retrieve and remove the highest and lowest Value.
import java.util.TreeSet;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Integer> set=new TreeSet<Integer>();  
         set.add(24);  
         set.add(66);  
         set.add(12);  
         set.add(15);  
         System.out.println("Highest Value: "+set.pollFirst());  
         System.out.println("Lowest Value: "+set.pollLast());  

	}

}
