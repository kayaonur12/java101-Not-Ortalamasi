package Donguler;

import java.util.Scanner;

public class Diamond_of_Stars {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int entry = input.nextInt();

        for (k = 1; k < (entry * 2); k++) {
            if (k <= entry) {
                for (int i = 1; i < entry * 2; i++) {
                    if (i < (entry - (k-1)))
                        System.out.print(" ");
                    else if (i >= (entry - (k-1)) && i <= (entry + (k-1)))
                        System.out.print("*");
                    else System.out.print(" ");
                }
            } else {
                for (int i = 1; i < entry * 2; i++) {
                    if (i <= (k - entry))
                        System.out.print(" ");
                    else if (i > (k - entry) && i < (entry*2-(k-entry)))
                        System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
