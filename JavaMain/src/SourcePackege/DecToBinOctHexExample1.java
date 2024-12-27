package SourcePackege;

public class DecToBinOctHexExample1 {

	public static void main(String[] args) {
	
		int decimal = 15;
		String binary = Integer.toBinaryString(decimal);//decimal to binary
		System.out.println(binary);
		
		int decimal2 = 15;
		String octal = Integer.toOctalString(decimal2);//decimal to octal
		System.out.println(octal);
		
		int decimal3 = 15;
		String hexadecimal = Integer.toHexString(decimal3);//decimal to hexadecimal
		System.out.println(hexadecimal);
	}

}
