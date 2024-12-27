package SourcePackege;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3 {

	public static void main(String[] args) {
		
     ArrayList<Integer>number = new	ArrayList<>();
     
     
     //adding elements
     number.add(10);
     number.add(20);
     number.add(30);
     number.add(3,40);
     
     Iterator itr = number.iterator();
     while(itr.hasNext()) {
    	 System.out.print(" "+itr.next());
     }
    
    
	}

}
