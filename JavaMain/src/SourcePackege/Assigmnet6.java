package SourcePackege;

import java.util.Scanner;

public class Assigmnet6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int digit;
		System.out.print("Enter a Digit number : ");
		digit = input.nextInt();
		if( digit == 0  ) {
			System.out.print("ZERO");
		}
		else if(digit == 1){
			System.out.print("ONE");
		}
		else if(digit == 2) {
			System.out.print("TWO");
		}
		else if(digit == 3) {
			System.out.print("THREE");	
		}
		else if(digit == 4) {
			System.out.print("FOUR");	
		}
		else if(digit == 5) {
			System.out.print("FIVE");	
		}
		else if(digit == 6) {
			System.out.print("SIX");	
		}
		else if(digit == 7) {
			System.out.print("SEVEN");	
		}
		else if(digit == 8) {
			System.out.print("EIGHT");	
		}
		else if(digit == 9) {
			System.out.print("NINE");	
		}
		else {
			System.out.print("Invalid Digit");
		}
		
	}

}
