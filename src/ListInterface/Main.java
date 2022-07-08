package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list = new ArrayList<String>(); //CreatingArrayList
		//LinkedList<String> list =  new LinkedList<String>();
		// Vector<String> list = new Vector<String>();
		//Stack<String> list = new Stack<String>(); //use push,pop
		list.add("Rahul");
		list.add("Vijay");
		list.add("Raj");
		list.add("Vijay");
		
		System.out.println(list);
		//list.pop();
		//traversing through iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

	}

}
