package SourcePackege;

import java.util.Scanner;

public class MaximumandMinimumExample1 {

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
		
		double max = number[0];
		double min = number[0];
		for(int i=1;i<5;i++) {
			if(max<number[i]) {
				max = number[i];
				if(min>number[i]) {
					min = number[i];
				}
			}
		}
		System.out.println("Summation : "+sum);
		System.out.println("Average of Number : "+avg);
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
	}
}
