package SourcePackege;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		   Scanner input = new Scanner(System.in);
	       Scanner input2 = new Scanner(System.in);
	       Scanner input3 = new Scanner(System.in);
	       Scanner input4 = new Scanner(System.in);
	       Scanner input5= new Scanner(System.in);
	       int id;
	       String title;
	       String price;
	       String description;
	       String category;
	       
	       
	       System.out.print("ID: ");
	       id = input.nextInt();
	       System.out.print("Title: ");
	       title = input2.nextLine();
	       System.out.print("Price: "); 
	       price = input3.nextLine();
	       System.out.print("Description: ");
	       description = input4.nextLine();
	        System.out.print("Category: ");
	       category = input5.nextLine();
	       
	       
	       System.out.println("ID: "+id);
	       System.out.println("Title: "+title);
	       System.out.println("Price: "+price);
	       System.out.println("Description: "+description);
	       System.out.println("Category: "+category);
		
	}

}
