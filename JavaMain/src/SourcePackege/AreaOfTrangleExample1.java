package SourcePackege;

import java.util.Scanner;


public class AreaOfTrangleExample1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		double base,height,area;
		
		System.out.print("Enter base number : ");
		base = input.nextDouble();
		
		System.out.print("Enter height number : ");
		height = input.nextDouble();
		
		area = 0.5*base*height;
		System.out.print("Area of Triangle = "+area);
    }

}
