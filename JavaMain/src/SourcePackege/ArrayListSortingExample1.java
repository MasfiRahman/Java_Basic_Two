package SourcePackege;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingExample1 {

	public static void main(String[] args) {
		
      ArrayList<Integer>number = new ArrayList<>();
      
      number.add(20);
      number.add(-3);
      number.add(18);
      number.add(92);
      number.add(0);
      number.add(2);
     System.out.println("Before Sorting  : "+number);     
     
     
     //ascending elements
     Collections.sort(number);
     System.out.println("After Sorting in Ascending : "+number);
      
     //descending elements
     Collections.sort(number,Collections.reverseOrder());
     System.out.println("After Sorting in Dscending : "+number);
	}

}
