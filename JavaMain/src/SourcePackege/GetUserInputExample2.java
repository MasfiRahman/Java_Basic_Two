package SourcePackege;

import java.util.Scanner;

public class GetUserInputExample2 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        String name;
	        System.out.print("Enter your name : ");
	        name = input.nextLine();
	        System.out.print("Welcome : "+name);
		

	}

}
