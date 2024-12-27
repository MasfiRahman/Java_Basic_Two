package SourcePackege;

import java.util.Arrays;

public class ArraySortingExample2 {

	public static void main(String[] args) {
		
		String [] names = {"Masfi" , "Ritu" , "Sanji" , "Tushi"};
		
		Arrays.sort(names);
		
		System.out.print("Ascending Name : ");
		System.out.println();
		for(int i=0;i<4;i++) {
			System.out.print(" "+names[i]);
		}
		System.out.println();
		
		System.out.print("Descending Name :");
		System.out.println();
		for(int i=3;i>=0;i--) {
			System.out.print(" "+names[i]);
		}
	}

}
