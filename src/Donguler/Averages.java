package Donguler;

import java.util.Scanner;

public class Averages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entry;
        double sum = 0, k = 0;

        do {
            System.out.print("Please enter an integer bigger than 2: ");
            entry = input.nextInt();
        } while (entry <= 2);

        for (int i = 1; i <= entry; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
                k++;
            }
        }
        System.out.print("Averages of numbers dividable to 3 & 4 starting from 0 to your entry is: " +(sum / k));
    }
}
/*      Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integar");
        int entry = input.nextInt();

        for (int i =1;i<=entry;i++){
            if (i%2==0)
                System.out.println(i);
        }

        or

        int i = 0;
        while (i < entry) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }

*/