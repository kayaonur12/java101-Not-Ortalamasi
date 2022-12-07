package Metotlar;

import java.util.Scanner;

public class Recursive_Prime {

    static boolean isPrime(int a, int b) {

        if (a>b) {
            if (a % b == 0) {
                return false;
            } else {
                return isPrime(a, b + 1);
            }
        } else return a >= b;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number you want to check: ");
        int a = input.nextInt();
        int b = 2;
        System.out.print(a + " " + (isPrime(a, b) ? " is Prime number." : " is not a Prime number."));
    }
}
