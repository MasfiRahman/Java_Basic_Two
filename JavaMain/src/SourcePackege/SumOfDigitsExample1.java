package SourcePackege;

import java.util.Scanner;

public class SumOfDigitsExample1 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);	
	
	int   r , num , temp , sum = 0;
   System.out.print("Enter any Positive number : ");
	num = input.nextInt();
	temp = num;
	
	while(temp!=0) {
		r = temp % 10 ;
		sum = sum + r;
		temp = temp / 10;
	}
	System.out.print("Sum of Digits :  "+sum);
	}
}
