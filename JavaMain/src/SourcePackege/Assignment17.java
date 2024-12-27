package SourcePackege;

import java.util.Scanner;


public class Assignment17 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
	
	        
		System.out.print("Enter a line Number : ");
	      
        int n = input.nextInt();
        
        System.out.println("/*");
     
        for(int row=1;row<=n;row++) {
        	for(int col=1;col<=row;col++) {
        		
        		System.out.print(" "+col%2);

        	}
        	System.out.println();
        }
       
        System.out.print("*/");
	}

}
