package SourcePackege;

import java.util.Scanner;

public class Assignment12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start, end, sum = 0;

        System.out.print("Enter start number:");
        start = input.nextInt();

        System.out.print("Enter end number:");
        end = input.nextInt();

        for (start = 1; start <= end; start = start + 2) {
            sum = sum + start;

        }

        System.out.println("The total odd number is:" + sum);
    }
}
