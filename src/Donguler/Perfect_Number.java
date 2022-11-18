package Donguler;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter finish number of the range (which is starting from 1) to see all perfect numbers between: ");
        int finish = input.nextInt(), sum, k;

        for (int i = 2; i <= finish; i++) {
            sum = 0;
            for (k = 1; k < i; k++) {
                if ((i % k) == 0)
                    sum += k;
            }
            if (sum == i)
                System.out.println(i + " is a perfect number!");
        }
    }
}

