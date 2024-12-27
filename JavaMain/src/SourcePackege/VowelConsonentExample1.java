package SourcePackege;

import java.util.Scanner;

public class VowelConsonentExample1 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner	(System.in);

	char ch;
	System.out.print("Enter any Letter : ");
	ch = input.next().charAt(0);
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
		System.out.print("VOWEL");
	}
	else {
		System.out.print("CONSONENT");
	}
	}

}
