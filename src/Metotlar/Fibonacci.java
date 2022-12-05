package Metotlar;

import java.util.Scanner;

public class Fibonacci {

    //This code gives the fibonacci series.

    static int isFibonacci(int n) {
        if (n == 2 || n == 1)
            return 1;
        else {
            return isFibonacci(n - 1) + isFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the series size: ");
        int n = input.nextInt();
        for (int i=1;i<=n;i++) {
            System.out.print(isFibonacci(i)+" ");
        }
    }
}
