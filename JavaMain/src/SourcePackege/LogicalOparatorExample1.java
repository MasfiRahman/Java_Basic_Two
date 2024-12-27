package SourcePackege;

import java.util.Scanner;

public class LogicalOparatorExample1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner	(System.in);
		
		char ch;
		System.out.print("Enter any letter : ");
		ch = input.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.print("small letter");
		}
		else if(ch >= 'A'  && ch <= 'Z') {
			System.out.print("Capital letter");
		}
		else {
			System.out.print("Not a letter");
		}
	}

}
