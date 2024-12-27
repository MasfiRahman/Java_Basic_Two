package SourcePackege;

import java.util.Scanner;

public class ArithmaticOparatorExample2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1,num2,result;
		System.out.print("Enter the First number : ");
		num1=input.nextInt();
		System.out.print("Enter the Second number : ");
		num2=input.nextInt();
		
		result = num1 + num2;
		System.out.println("Summation is : "+result);
		
		result = num1 - num2;
		System.out.println("Subtraction is : "+result);
		
		result = num1 * num2;
		System.out.println("Multiplicvation is : "+result);
		
		double result2 = (double) num1 / num2;
		System.out.printf("Division is :%.2f\n ",result2);
		
		result = num1 % num2;
		System.out.println("Remainder is : "+result);
	}

}
