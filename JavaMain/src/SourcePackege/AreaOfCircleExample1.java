package SourcePackege;

import java.util.Scanner;


public class AreaOfCircleExample1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double radius,area;
		
		System.out.print("Enter radius : ");
          radius = input.nextDouble();
          
          area = 3.1416 * radius *radius;
          System.out.print("Area of Triangle = "+area);
	}

}
