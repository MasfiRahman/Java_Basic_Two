package SourcePackege;

import java.util.Scanner;

public class MatrixPart3Example1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int [][] A = new int [3][3];
		int SumofDiagonalElemnts = 0;
		int SumofUpperTriangleElements = 0;
		int SumofLowerTriangleElements = 0;
		
		System.out.println("Enter Numbers : ");
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
					A[row][col] = input.nextInt();
			}
		}
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				if(row==col) {
					SumofDiagonalElemnts = SumofDiagonalElemnts	+ A[row][col];
				}
				if(row<col) {
					SumofUpperTriangleElements = SumofUpperTriangleElements + A[row][col];	
				}
				if(row>col) {
					SumofLowerTriangleElements = SumofLowerTriangleElements + A[row][col];
				}
			}
		}
		System.out.println("SUM  OF DIAGONAL ELEMENTS :  "+SumofDiagonalElemnts);
		System.out.println("SUM  OF UPPER TRIANGLE ELEMENTS :  "+ SumofUpperTriangleElements);
		System.out.println("SUM  OF LOWER TRIANGLE ELEMENTS ELEMENTS :  "+SumofLowerTriangleElements);

	}

}
