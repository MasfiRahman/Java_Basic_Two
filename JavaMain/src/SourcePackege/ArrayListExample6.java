package SourcePackege;

import java.util.ArrayList;

public class ArrayListExample6 {

	public static void main(String[] args) {
		
		  ArrayList<Integer>number = new	ArrayList<>();
		     
		     //adding elements
		     number.add(10);
		     number.add(20);
		     number.add(40);
		     number.add(3,30);
				
		     //array listing elements
		     System.out.println("Array List Contains : "+number);
		     
		     System.out.println();
		     
		     //sizing  array elements
		     System.out.println("Size = "+number.size());
		     
		     System.out.println();
		     
		     //empty elements
		     boolean check = number.isEmpty();
		     System.out.println("Empty Array List Contains : "+check);
		     
		     System.out.println();
		     
		     //contains elements
		     boolean contain = number.contains(30);
		     System.out.println("30 is in the list : "+contain);
		     
		     System.out.println();
		     
		     //index elements
		     int index = number.indexOf(40);
		     System.out.println("The Index of 40 : "+index);
		     
		     System.out.println();
		     
		     //setting(replacing) elements
		     number.set(3, 50);
		     System.out.println("After Setting Number : "+number);
		     
		     
		     System.out.println();
		     
		     //getting elements
		     int x = number.get(0);
		     System.out.print("Index 0 : "+x);

	}

}