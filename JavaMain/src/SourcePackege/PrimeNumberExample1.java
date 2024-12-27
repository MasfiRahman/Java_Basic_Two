package SourcePackege;

import java.util.Scanner;

public class PrimeNumberExample1 {

	public static void main(String[] args) {
		
		
		Scanner input  = new Scanner (System.in);
		
		int  num , count = 0  , i;
		
		System.out.print("Enter any Positive number : ");
		num = input.nextInt();
		
		for(i=2;i<num;i++) {
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
