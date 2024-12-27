package SourcePackege;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
	int phoneprice ;
	System.out.print("Phone Price = ");
	phoneprice = input.nextInt();
	
		 int numberofinstallment;
		 System.out.print("Number Of Installment : ");
		 numberofinstallment = input.nextInt();
		 
		 int installmentPerMonth = phoneprice/numberofinstallment ;
		
		  System.out.println("Monthly installment Amount: "+installmentPerMonth + "euros" );
	}

}
