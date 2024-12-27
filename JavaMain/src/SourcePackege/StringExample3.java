package SourcePackege;

public class StringExample3 {

	public static void main(String[] args) {
		

		String firstname = "Mashrur";
		String lastname = " Masfi";
		String fullname = firstname.concat(lastname);
		System.out.println("Full Name : "+fullname);
		
		//upper case elements
		String uppername = fullname.toUpperCase();
		System.out.println("Upper name : "+uppername);
		
		//lower case elements 
		String lowername = fullname.toLowerCase();
		System.out.println("Lower name : "+lowername);
		
		//starts with elements
		boolean b = firstname.startsWith("M");
		System.out.println("b = "+b);
		
		//ends with elements
		boolean last = lastname.endsWith("m");
		System.out.println("Last = "+last);
		
		//for each loop(string)elements
		String [] name = {"Mas" , "Rah" , "Fi"};
		for(String x : name) {
			System.out.println(x);
		}
		
	}

}
