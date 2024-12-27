package SourcePackege;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		
    Scanner input = new Scanner (System.in);
    
    int num, first = 0, second = 1, fibo = 0;

    System.out.print("See the fibonacci number : ");
    num = input.nextInt();
    
  
    for (int i = 3; i <= num; i++) {
        fibo = first + second;
        first = second;
        second = fibo;
    }
    System.out.print("Fibonaki  number is: " + fibo);
	} 
}
