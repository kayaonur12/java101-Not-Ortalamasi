package Donguler;

import java.util.Scanner;

public class Power_Finder {
    public static void main(String[] args) {
        int i = 1, k = 4, l = 5, entry;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        entry = input.nextInt();

        // to write all square root accordingly this is the code. If we want it separately than the solution is below.
        while (i < entry) {
            if (i == k) {
                k = k * 4;
                System.out.print(i + ",");
                i++;
            } else if (i == l * 5) {
                l = l * 5;
                System.out.print(i + ",");
                i++;
            } else {
                i++;
            }
        }
    }
}
/*
        for(i=1;i<entry;i*=4)
        System.out.println(i+",");
        for(i=1;i<entry;i*=5)
            System.out.println(i+",");
    }
}
*/