package SourcePackege;

import java.util.Scanner;

public class FactorialProgramExample1 {

	public static void main(String[] args) {
		
		
	Scanner input = new Scanner (System.in);
	
	
             int i,num,fact = 1;		
		System.out.print("Enter any positive number : ");
        num = input.nextInt();
		
        for(i=num;i>=1;i--) {
        	System.out.println(+i);
        	fact = fact*i;
        }
        System.out.print("Factorial of "+num  +  " = "  +fact);
	}

}
