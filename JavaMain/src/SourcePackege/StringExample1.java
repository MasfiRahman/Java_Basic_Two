package SourcePackege;

public class StringExample1 {

	public static void main(String[] args) {
		
	  String s1 = "Masfi Rahman";
	  String s2 = new String("Masfi Rahman");
	  char[] s3 = {'m' , 'a' ,'s' ,'f' ,'i'};
	  int len = s1.length();
	  
	  
	  
	  System.out.println("S1 = "+s1);
	  System.out.println("S2 = "+s2);
	  System.out.println(s3);
	  System.out.println("Length of S1 : "+len);
	
	  if(s1==s2) {//not comparing value
		  System.out.print("Equals");
	  }else {
		  System.out.print("Not Equals");
	  }
	  
	  System.out.println();
	  
	  if(s1.equals(s2)) {//all comparing elements
		  System.out.print("Equals");
	  }else {
		  System.out.print("Not Equals");
	  }
	  
	  System.out.println();
	  
	  if(s1.contains(s2)) {//all comparing elements
		  System.out.print("Equals");
	  }else {
		  System.out.print("Not Equals");
	  }
	  
	  System.out.println();
	  
	  if(s1.equalsIgnoreCase(s2)) {//upper case and lower case ignoring
		  System.out.print("Equals");
	  }else {
		  System.out.print("Not Equals");
	  }
	  
	  System.out.println();
	  
	  boolean con = s1.contains("mami");//containing unknown(new) value
	  System.out.println(con);
	  
	  boolean con2 = s1.contains("Rahman");
	  System.out.println(con2);
	  
	  boolean b = s1.isEmpty();
	  System.out.println("b = "+b);
	  
	  
	  
	}
}
