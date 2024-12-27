package SourcePackege;

import java.util.Scanner;

public class ArraySumandAverageExample3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[]number = new double[5];
		double  sum = 0;
		
		System.out.print("Enter  Number : ");
		
		for(int i=0;i<number.length;i++) {
			number[i] = input.nextDouble(); 
		}
		for(int i=0;i<number.length;i++) {
		sum=sum+number[i];	
		}
		double avg = sum/number.length;
		System.out.print("Average of Number : "+avg);
	}
}
