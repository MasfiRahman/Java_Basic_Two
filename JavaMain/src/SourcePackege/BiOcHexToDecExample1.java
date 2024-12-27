package SourcePackege;

public class BiOcHexToDecExample1 {

	public static void main(String[] args) {
		
		String binary = "1010";
		int decimal = Integer.parseInt(binary, 2);//binary to decimal
		System.out.println(decimal);
		
		String octal = "675";
		int decimal2 = Integer.parseInt(octal,8);//octal to decimal
		System.out.println(decimal2);
		
		String hexadecimal = "F";
		int decimal3 = Integer.parseInt(hexadecimal, 16);//hexadecimal to decimal
		System.out.println(decimal3);
		
	}

}
