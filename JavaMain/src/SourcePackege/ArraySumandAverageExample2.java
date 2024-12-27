package SourcePackege;

import java.util.Scanner;

public class ArraySumandAverageExample2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[]number = new double[5];
		double  sum = 0;
		
		System.out.print("Enter 5 Number : ");
		
		for(int i=0;i<5;i++) {
			number[i] = input.nextDouble(); 
		}
		for(int i=0;i<5;i++) {
		sum=sum+number[i];	
		}
		System.out.print("Summation : "+sum);
	}
}	