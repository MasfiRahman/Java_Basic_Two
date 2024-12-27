package SourcePackege;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);	
		
	int temp , sum , i , totalAmstrongNumber=0 , m , n , r;
	System.out.print("Enter Intial Number : ");
    m = input.nextInt();
    
    System.out.print("Enter Final Number : ");
    n = input.nextInt();
    
   for(i=m;i<=n;i++) {
	   sum = 0;
	   temp = i;
	
   while(temp!=0) {
   	r = temp % 10;
   	sum = sum + r*r*r;
   	temp = temp / 10;
   }
   if(sum==i) {
	   totalAmstrongNumber++;
	   System.out.println(i+" ");
   }
	}
	System.out.println();
    System.out.print("Total Amstrong Number : "+totalAmstrongNumber);
 }
}