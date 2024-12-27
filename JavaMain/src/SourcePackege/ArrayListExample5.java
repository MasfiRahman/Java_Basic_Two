package SourcePackege;

import java.util.ArrayList;

public class ArrayListExample5 {

	public static void main(String[] args) {
		
		  ArrayList<Integer>number = new	ArrayList<>();
		     
		     //adding elements
		     number.add(10);
		     number.add(20);
		     number.add(40);
		     number.add(3,30);
				
		     System.out.println("Array List Contains : "+number);	
		     System.out.println();
		     System.out.println("Size = "+number.size());
		     
		     //clearing elements
		     number.clear();
		     System.out.print("After Clearing Array List Contains : "+number);
		

	}

}
