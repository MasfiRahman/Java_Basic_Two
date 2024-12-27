package SourcePackege;

import java.util.Scanner;


public class SeriesProgramExample4 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int i,n,sum=0;
		System.out.print("Enter the last number : ");
		n = input.nextInt();
		
		for(i=1;i<=n;i=i+1) {
			System.out.print(i+"X"+i+" ");
			sum = sum+i*i;
		}
         System.out.println();
         System.out.print("Sum : "+sum);
	}

}

