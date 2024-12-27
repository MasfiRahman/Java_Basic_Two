package SourcePackege;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age;
		System.out.print("Enter a Age number : ");
		age = input.nextInt();
		if(age > 18) {
			System.out.print("Valid voter");
		}
		else {
			System.out.print("Invalid voter");
		}
	}

}
