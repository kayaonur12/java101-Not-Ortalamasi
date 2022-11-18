package Donguler;

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter last number of the range (which is starting from 1) to see all prime numbers between: ");
        int i = input.nextInt(), l;

        //finds the prime numbers till the writen range that asked to user.

        for (int k = 2; k <= i; k++) {
            l = 0;
            for (int n = 2; n < (k/2+1); n++) {
                if (k % n == 0) {
                    l++;
                    break;
                }
            }
            if (l == 0)
                System.out.print(k + " ");
        }
    }
}
