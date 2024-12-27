package SourcePackege;

import java.util.Scanner;


public class ConditionalOparatorExample1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1,num2,Large;
		System.out.print("Enter 2 number : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		Large = (num1>num2)?num1:num2;
		System.out.print("Large number : "+Large);
	}

}
