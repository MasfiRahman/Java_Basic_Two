package SourcePackege;

import java.util.Scanner;


public class Assignment9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int option;
		 System.out.print("Enter any option number : ");
         option = input.nextInt();
         switch(option) {
         case 1:
        	 System.out.println("selected Bengali language");
        	 break;
         case 2:
        	 System.out.println("selected Hindi language");
        	 break;
         case 3:
        	 System.out.println("selected Urdu language");
        	 break;
         case 4 :
        	 System.out.print("selected English language");
        	 break;
         default :
        		 System.out.print("Sorry sir! you are trying any other option");	 
         }	 

	}

}
