package SourcePackege;

import java.util.Scanner;

public class ElseIfExample1 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 int num;
			System.out.print("Enter a number : ");
			num = input.nextInt();
			
			if(num>0) {
				System.out.print("Positive");
			}
			else if(num<0) {
				System.out.print("Negative");
			}
			else {
				System.out.print("Zero");
			}

	}

}
