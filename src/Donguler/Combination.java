package Donguler;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cluster number: ");
        int cluster = input.nextInt();
        System.out.print("Enter the combination factor number: ");
        int factor = input.nextInt();
        int numerator = 1, denominator = 1;

        for (int i = cluster; i > (cluster - factor); i--)
            numerator *= i;
        for (int i = factor; i > 0; i--)
            denominator *= i;
        System.out.println("Combination of C(" + cluster + "," + factor + ") is: " + (numerator / denominator));
    }
}

/* factorial
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int entry = input.nextInt();
        int fak = 1;

        for (int i = 1; i <= entry; i++) {
            fak *= i;
        }
        System.out.println("Factorial of "+entry+" is = "+fak);
 */