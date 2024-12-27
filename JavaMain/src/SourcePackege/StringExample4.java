package SourcePackege;

public class StringExample4 {

	public static void main(String[] args) {
		
		
		String country = "  Bangladesh is  my country  ";
		System.out.println(country);
		
		//gap remove elements
        String s3 = country.trim();
        System.out.println(s3);
		
		//char At elements
		char ch = country.charAt(0);
		System.out.println("Ch = "+ch);
		
		//codePointAt elements
		int  value = country.codePointAt(0);
        System.out.println("Value : "+value);
        
        //index of elements
        int pos = country.indexOf('n');
        System.out.println("The index position of n : "+pos);
        
        // last index of elements
        pos = country.lastIndexOf('n');
        System.out.println("The Last index position of n : "+pos);
        
  
	}

}
