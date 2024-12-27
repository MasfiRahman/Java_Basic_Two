package SourcePackege;

import java.util.Scanner;

public class TemparatureConverterExample1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double cels,faren;
		System.out.print("Celcius = ");
		cels = input.nextDouble();
		
		faren = 1.8 *cels + 32;
		System.out.print("Farenheit : "+faren);

	}

}
