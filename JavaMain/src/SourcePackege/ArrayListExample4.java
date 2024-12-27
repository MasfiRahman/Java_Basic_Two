package SourcePackege;

import java.util.ArrayList;

public class ArrayListExample4 {

	public static void main(String[] args) {
		
    ArrayList<Integer>number = new	ArrayList<>();
     
     //adding elements
     number.add(10);
     number.add(20);
     number.add(40);
     number.add(3,30);
		
     System.out.println("Array List Contains : "+number);
    
     //removing elements
     number.remove(2);
     System.out.println("After Removing Array List Contains : "+number);
    
     System.out.println();
     
     number.removeAll(number);
     System.out.println("After Removing All : "+number);
	}

}