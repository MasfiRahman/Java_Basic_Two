package SourcePackege;

import java.util.Scanner;


public class PrimeNumberExample3 {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner (System.in);		
		
		int i , j, m , n , count = 0 , totalprime = 0;
		
		System.out.print("Enter Initial Number : ");
		m = input.nextInt();
		
		System.out.print("Enter Final Number :  ");
		n = input.nextInt();
		
		for(i=m;i<=n;i++) {
			for(j=2;j<=i-1;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
				totalprime++;
			}
			count=0;
		}
		System.out.print("Total of Prime Number :  "+totalprime);
	}

}
