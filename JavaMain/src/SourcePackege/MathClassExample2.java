package SourcePackege;

public class MathClassExample2 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 3;
		
		int max = Math.max(x, y);
		System.out.println("Maximum = "+max);
		
		
		int min = Math.min(x, y);
		System.out.println("Minimum = "+min);
		
		
		int absolute = Math.abs(y);
		System.out.println("Absolute of Y = "+absolute);
		
		
	     double power = Math.pow(x, y);
	     System.out.println("X to the power of Y = "+power);
		
	     int round = Math.round(8.4f);
	     System.out.println("Round of 8.4 = "+round);
		
	     double pi = Math.PI;
	     System.out.println("PI = "+pi);
	     
	     double e = Math.E;
	     System.out.println("E = "+e);
	}

}
