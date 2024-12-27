package SourcePackege;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		
		int [] number = new int[5];
		
		number [0] = 10;
		number [1] = 20;
		number [2] = 30;
		number [3] = 40;
		number [4] = 50;
				
		System.out.println(number[0]);
		
		int len = number.length ;
        System.out.println("Array Size : "+len);
        
        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.print("Summation of Array : "+sum);
        
	}

}
