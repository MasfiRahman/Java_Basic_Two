package SourcePackege;

import java.util.Scanner;


public class SeriesProgramExample6 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int i,n,mul=1;
		System.out.print("Enter the last number : ");
		n = input.nextInt();
		
		for(i=1;i<=n;i=i+1) {
			System.out.println(i+"x"+i+"");
			mul = mul+i*i;
		}
         System.out.println();
         System.out.print("Multiplication : "+mul);
	}

}
