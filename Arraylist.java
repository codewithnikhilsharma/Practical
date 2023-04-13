package Collection;

import java.util.ArrayList;

import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer>List = new ArrayList<Integer>();
		ArrayList<String>List1 = new ArrayList<String>();
//		ArrayList<Boolean>List2 = new ArrayList<Boolean>();
		
		// add elements
		List.add(0);
		List.add(1);
		List.add(2);
		
		List1.add("Nikhil");
		List1.add("Parry");
		List1.add("ritik");
		
		System.out.println(List);
		System.out.println(List1);
		
		// get element
		
		int element = List.get(2);
		System.out.println(element);
		
		String name = List1.get(1);
		System.out.println(name);
		
		// add el in between
		
		List.add(3, 3);
		System.out.println(List);
		
		List1.add("Sharma");
		System.out.println(List1);
		
		// Set element
		
		List.set(0,1);
		System.out.println(List);
		
		List1.set(1, "Pryanshu");
		System.out.println(List1);
		
		// Delete element
		
		List.remove(3);
		System.out.println(List);
		
		List1.remove(1);
		System.out.println(List1);
		
		// Size
		
		int size = List.size();
		System.out.println(size);
		
	   // loop
		
		for(int i=0; i<List.size(); i++) {
			System.out.println(List.get(i));
		}
		 System.out.println();
	
		// Sorting
		 
		 Collections.sort(List);
		 System.out.println(List);
		 
		 Collections.sort(List1);
		 System.out.println(List1);
		 
		
	}
}
