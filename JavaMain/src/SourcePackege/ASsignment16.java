package SourcePackege;

import java.util.Scanner;

public class ASsignment16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String User;
		String Pass;
		System.out.print("Enter Your Username : "); 
		 User = input.nextLine();
        System.out.print("Enter Your Password : ");
        Pass = input.nextLine();
     
        if(User.equals("Masfi") && Pass==("23101182")){
        	System.out.print("Welcome to the system of UCAM of UAP");
        }else {
        	 System.out.print("Sorry! your Username and Password are incorrect"); 
        }
        }
	}
