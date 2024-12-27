package SourcePackege;

import java.util.Scanner;


public class MultiplicationTableExample1 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		int i,num;
		System.out.print("Enter any number : ");
		num = input.nextInt();
		
		for(i=1;i<=10;i++) {
			System.out.println(num+ " x " +i + " = "+num*i);
		}

	}

}
