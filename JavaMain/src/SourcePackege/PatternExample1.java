package SourcePackege;

import java.util.Scanner;


public class PatternExample1 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a line Number : ");
        int n = input.nextInt();
        
        for(int row=1;row<=n;row++) {
        	for(int col=1;col<=row;col++) {
        		System.out.print(" "+col);
        	}
        	System.out.println();
        }
	}

}
