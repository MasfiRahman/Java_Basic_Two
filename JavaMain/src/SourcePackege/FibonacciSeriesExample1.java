package SourcePackege;

import java.util.Scanner;

public class FibonacciSeriesExample1 {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner (System.in);	
		
		int i , num , fibo , first = 0 , second = 1;
		System.out.print("How many number : ");
		num = input.nextInt();
		
		System.out.print(first+ " " +second);

		for(i=3;i<=num;i++) {
			fibo = first +second;
			System.out.print(" " +fibo);
			first = second;
			second = fibo;
		}
		System.out.println();
	}

}
