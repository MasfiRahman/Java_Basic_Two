package SourcePackege;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		 int num;
		System.out.print("Enter a number : ");
		num = input.nextInt();
		
		if(num>0) {
			System.out.print("This is positive number");
		}
	}

}
