package Metotlar;

import java.util.Scanner;

public class Recursive_Pattern {
    static void pattern(int a, int i, int n, int temp) {

        if ((a == temp && i > 0) || (a <= 0 && i == 0))
            System.out.print(a);
        else {
            if (a > 0 && n == 0) {
                System.out.print(a + " ");
                pattern(a - 5, i + 1, n, temp);
            } else {
                System.out.print(a + " ");
                pattern(a + 5, i, n + 1, temp);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please indicate a number. ");
        int a = input.nextInt();
        pattern(a, 0, 0, a);
    }
}

