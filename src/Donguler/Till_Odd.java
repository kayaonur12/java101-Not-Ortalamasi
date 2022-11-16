package Donguler;

import java.util.Scanner;

public class Till_Odd {
    public static void main(String[] args) {
        int entry, sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            entry = input.nextInt();
            if (entry % 4 == 0)
                sum += entry;
        } while (entry % 2 == 0);

        System.out.println("Sum of the entered numbers that can be divided to 4 is: "+sum);
    }
}
  /*    Sadece while ile yapılırsa
        System.out.print("Enter a number: ");
        entry = input.nextInt();

        while (entry % 2 == 0) {
            if (entry%4==0)
                sum += entry;
            System.out.print("Enter a number: ");
            entry = input.nextInt();
        }
        System.out.println(sum);
*/