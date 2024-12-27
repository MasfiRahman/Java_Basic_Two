package SourcePackege;

import java.util.Scanner;

public class PalindromeNumberExample1 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	
		int r , num , rev , sum = 0 , temp ;
		System.out.print("Enter any Positive Number : ");
        num = input.nextInt();
        temp = num;
        
        while(temp!=0) {
        	r = temp % 10;
        	sum = sum * 10 + r;
        	temp = temp / 10;
        }
        if(num==sum) {
        	System.out.print("Pallindrome Number");
        }else {
        	System.out.print("Not Pallindrome Number");
        }
	}

}
