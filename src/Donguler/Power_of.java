package Donguler;

import java.util.Scanner;

public class Power_of {
    public static void main(String[] args) {
        int number, power, i, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.print("Enter the power: ");
        power = input.nextInt();

        for (i = 1; i <= power; i++)
            total *= number;
        System.out.println("Answer is: " + total);
    }
}
