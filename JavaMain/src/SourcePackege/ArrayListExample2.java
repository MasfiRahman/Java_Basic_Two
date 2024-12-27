package SourcePackege;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		 ArrayList<Integer>number = new	ArrayList<>();	
         
		//adding elements
	     number.add(10);
	     number.add(20);
	     number.add(30);
	     number.add(3,40);
	     
	for(int x : number) { 
		System.out.print(" "+x);
	}
	}

}
