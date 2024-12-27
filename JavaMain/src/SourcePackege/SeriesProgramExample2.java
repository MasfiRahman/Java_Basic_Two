package SourcePackege;

import java.util.Scanner;


public class SeriesProgramExample2 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int i,n,sum=0;
		System.out.print("Enter the last number : ");
		n = input.nextInt();
		
		for(i=1;i<=n;i=i+2) {
			System.out.print(" "+i);
			sum = sum+i;
		}
         System.out.println();
         System.out.print("Sum : "+sum);
	}

}

