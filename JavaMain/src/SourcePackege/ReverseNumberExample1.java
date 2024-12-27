package SourcePackege;

import java.util.Scanner;

public class ReverseNumberExample1 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		int r , temp , sum = 0  , num ;
		System.out.print("Enter any Positive Number : ");
		num = input.nextInt();
		temp = num;
		
		while(temp!=0) {
			r = temp % 10;
			sum = sum * 10 + r ;
			temp = temp / 10 ;
		}
		System.out.print("Reverse of Digits of number = "+sum);
	}

}
