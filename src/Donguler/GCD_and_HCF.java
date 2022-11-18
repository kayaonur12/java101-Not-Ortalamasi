package Donguler;

import java.util.Scanner;

public class GCD_and_HCF {
    public static void main(String[] args) {
        int i = 2, n, gcd = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert the two numbers you would like to get calculation:");
        int aa = input.nextInt();
        int bb = input.nextInt();
        int a = aa;
        int b = bb;
        do {
            System.out.print("Please press 1 to calculate Greatest Common Divisor (GCD) and press 2 to calculate Highest Common Factor(HCF): ");
            n = input.nextInt();
        } while (n < 1 || n > 2);


        while (i <= Math.abs(a + b)) {
            while (a % i == 0 || b % i == 0) {
                if (a % i == 0 && b % i == 0) {
                    gcd *= i;
                    a = a / i;
                    b = b / i;
                } else if (a % i == 0)
                    a = a / i;
                else if (b % i == 0)
                    b = b / i;
            }
            if ((a == 1 || a == -1) && (b == 1 || b == -1)) {
                break;
            }
            i++;
        }
        if (n == 1)
            System.out.println("GCD is: " + gcd);
        else {
            System.out.println("HCF is: " + ((aa * bb) / gcd));
        }
    }
}
