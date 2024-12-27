package SourcePackege;

import java.util.Random;

public class RandomNumberGemeratorExample1 {

	public static void main(String[] args) {
		
	   Random rand = new Random();
	   int randomNumber = rand.nextInt(10) + 1;
	   System.out.println("Random Number : "+randomNumber);
		
		int randomNumber2  = (int) (Math.random()*10) + 1;
        System.out.println("Random NUmber : "+randomNumber2);
	}

}
