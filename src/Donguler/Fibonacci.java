package Donguler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please indicate number of fibonacci series that you would like to see: ");
        int i = input.nextInt();
        int first = 0, second = 1, sum;

        for (int k = 1; k <= i; k++) {
            sum=0;
            sum = first + second;
            System.out.println(first + " + " + second + " = " + sum);
            first = second;
            second = sum;
        }
    }
}
