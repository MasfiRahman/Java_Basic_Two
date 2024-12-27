package SourcePackege;

import java.util.Scanner;


public class MultiplicationTableExample2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int m , n , i , j;
		
		System.out.print("Enter intial number : ");
		m = input.nextInt();
		
		System.out.print("Enter final number : ");
		n = input.nextInt();
		
		for(i=m;i<=n;i++) {
			for(j=1;j<=10;j++) {
				System.out.println(i+ "x" +j +" = " +i*j);
			}
			System.out.print("\n\n");
		}

	}

}
