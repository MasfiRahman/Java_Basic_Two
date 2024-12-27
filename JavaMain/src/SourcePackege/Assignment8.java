package SourcePackege;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		char candi;
		System.out.print("Ask the candidate have you completed your masters?");
		candi = input.next().charAt(0);
		System.out.print("Ask the candidate are you fulent in English?");
		candi = input.next().charAt(0);
		if(candi == 'y') {
			System.out.print("you are eligible to for the job interview");
		}
		else if (candi == 'n') {
			System.out.print("Sorry. you are not eligible to for the job interview");
		}
		else {
			System.out.print("you are preparing for next time");
		}
	}

}
