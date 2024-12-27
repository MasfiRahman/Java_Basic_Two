package SourcePackege;

public class StringToPrimitiveExample1 {

	public static void main(String[] args) {

      String s = "123";
      int i = Integer.parseInt(s);//String to primitive
      System.out.println("i = "+i);
		
      String s2 = "123.46";
      double d = Double.parseDouble(s2);//String to primitive
      System.out.println("d = "+d);
      
	}

}
