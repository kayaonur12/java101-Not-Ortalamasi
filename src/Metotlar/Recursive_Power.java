package Metotlar;

import java.util.Scanner;

public class Recursive_Power {

    static double power(double a, double b) {
        if (b > 1)
            return a * power(a, b - 1);
        else if (b == 1)
            return a;
        else if (b == 0)
            return 1;
        else if (b == -1)
            return 1 / a;
        else
            return (1 / a) * power(a, b + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.println("Please indicate base and exponent separately:");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("Result is: " + power(a, b)+"\n--------------------");
            System.out.println("If you want to do another calculation please press 1. Press any other number to exit: ");
            int i = input.nextInt();
            if (i == 1)
                n = 0;
            else
                n=1;
        } while (n == 0);
        System.out.println("Thanks for using our calculator!");
    }
}
