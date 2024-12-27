package SourcePackege;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char ch;
		System.out.println("Do you love java ?");
		ch = input.next().charAt(0);
		if(ch == 'y' || ch == 'Y' ) {
			System.out.print("you are java lover");
		}
		else if(ch == 'n' || ch == 'N') {
			System.out.print("you are not java lover");
		}
		else {
			System.out.print("you are busy in other study");
		}
	}

}
