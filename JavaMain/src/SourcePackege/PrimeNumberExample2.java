package SourcePackege;

import java.util.Scanner;


public class PrimeNumberExample2 {

	public static void main(String[] args) {
		
		
		Scanner input  = new Scanner (System.in);	
		
		int num , count = 0 , i;
		System.out.print("Enter any Positive Number : ");
		num =input.nextInt();
		
		if(num == 0 || num == 1) {
			System.out.print("Not Prime Number");
		}else {
			for(i=2;i<num/2;i++) {
				if(num%i==0) {
					count++;
					break;				
				}
			}
			if(count==0) {
				System.out.print("Prime Number");
			}else {
				System.out.print("Not Prime Number");
			}
		}
		
	}

}
