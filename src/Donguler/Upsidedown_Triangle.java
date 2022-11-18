package Donguler;

import java.util.Scanner;

public class Upsidedown_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please indicate row number: ");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int l = 1; l < i; l++)
                System.out.print(" ");
            for (int l=1;l<((row-(i-1))*2);l++)
                System.out.print("*");
            System.out.println();
        }
    }
}
