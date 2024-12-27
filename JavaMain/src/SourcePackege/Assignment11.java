package SourcePackege;

import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i,num,fact=1;
		System.out.print("Enter a Number : ");
		num = input.nextInt();
		
		for(i=1; i<=num; i++) {
			fact = fact*i;
			}
		System.out.println("Enter a Number of Factorial : "+fact);
		
	}

}
