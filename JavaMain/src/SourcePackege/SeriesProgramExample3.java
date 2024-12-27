package SourcePackege;

import java.util.Scanner;


public class SeriesProgramExample3 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		double i,n,sum=0;
		System.out.print("Enter the last number : ");
		n = input.nextDouble();
		
		for(i=1.5;i<=n;i=i+1) {
			System.out.print(" "+i);
			sum = sum+i;
		}
         System.out.println();
         System.out.print("Sum : "+sum);
	}

}

