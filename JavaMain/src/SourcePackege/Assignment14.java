package SourcePackege;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int r , m , n , rev  , temp , totalPalindromeNumber=0 , i , sum ;
		
		System.out.print("Enter Intial Number : ");
        m = input.nextInt();
        
        System.out.print("Enter Final Number : ");
        n = input.nextInt();
        
       for(i=m;i<=n;i++) {
    	   sum = 0;
    	   temp = i;

        while(temp!=0) {
        	r = temp % 10;
        	sum = sum * 10 + r;
        	temp = temp / 10;
        }
         if(sum==i) {
        	 totalPalindromeNumber++;
        	 System.out.println(i+"");
         }
         } 
      System.out.println();
      System.out.print("Total Palindrome numbers : "+totalPalindromeNumber);
	}

}
