package SourcePackege;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
     ArrayList<Integer>number = new	ArrayList<>();
     
     System.out.println("Size = "+number.size());
     
     //adding elements
     number.add(10);
     number.add(20);
     number.add(30);
     number.add(3,40);
		
     System.out.println(number);
    
     System.out.println("Size = "+number.size()); 
	}

}
