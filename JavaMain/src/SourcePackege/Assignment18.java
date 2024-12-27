package SourcePackege;

import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner (System.in);
		
		String[] weekday = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","Sunday"};
		System.out.print("Enter a Number : ");
		int day = input.nextInt();
		for(int i=0;i<=7;i++) {
			if(day==i+1) {
				System.out.print("The Day Name is : "+weekday[i]);
			}
		}
	}

}
