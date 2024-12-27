package SourcePackege;

public class BitwiseOperatorExample1 {

	public static void main(String[] args) {
	
		int a,b,c;
		
		a = 32;
		b = 32;
		
		c = a & b; 
		System.out.println("a & b = "+c);
		
		c = a| b;
		System.out.println("a | b = "+c);

		c = a ^ b;
		System.out.println("a ^ b = "+c);
		
		c = a >> 3;
		System.out.println("a >> 3 = "+c);
		
		c = b << 3;
		System.out.println("b << 3 = "+c);
	}

}
