package SourcePackege;

import java.util.Scanner;

public class ArraySumandAverageExample1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[]number = new double[5];
		double  sum = 0;
		
		System.out.print("Enter 5 Number : ");
		number [0] = input.nextDouble();
		number [1] = input.nextDouble();
		number [2] = input.nextDouble();
		number [3] = input.nextDouble();
		number [4] = input.nextDouble();
		
		sum = number[0]+number[1]+number[2]+number[3]+number[4];
		System.out.print("Summation : "+sum);
	}

}
