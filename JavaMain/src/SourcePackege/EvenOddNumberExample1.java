package SourcePackege;

import java.util.Scanner;

public class EvenOddNumberExample1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter a positive number : ");
		num = input.nextInt();
		if(num % 2 == 0) {
			System.out.print("EVEN");
		}
		else {
			System.out.print("ODD");
		}
		
		
	}

}
