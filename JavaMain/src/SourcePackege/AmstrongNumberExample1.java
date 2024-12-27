package SourcePackege;

import java.util.Scanner;

public class AmstrongNumberExample1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
       
		 int num , temp , sum = 0  , r ;
		 System.out.print("Enter a Positive NUmber : ");
		 num = input.nextInt();
		 temp = num;
		 
		 while(temp!=0) {
			 r = temp % 10;
			 sum = sum + r*r*r;
			 temp = temp / 10;
		 }
		 if(num==sum) {
			 System.out.print("Amstrong NUmber");
		 }else {
			 System.out.print("Not Amstrong Number");
		 }
	}

}
