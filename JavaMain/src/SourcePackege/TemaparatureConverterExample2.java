package SourcePackege;

import java.util.Scanner;

public class TemaparatureConverterExample2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double faren,cels;
		System.out.print("Farenheit = ");
		faren = input.nextDouble();
		
		cels = 0.55 *(faren - 32);
		System.out.print("Celcius : "+cels);

	}

}
