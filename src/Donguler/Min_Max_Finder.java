package Donguler;

import java.util.Scanner;

public class Min_Max_Finder {
    public static void main(String[] args) {
        int min=0, max=0, x;
        Scanner input = new Scanner(System.in);
        System.out.print("Please indicate cluster number: ");
        int i = input.nextInt();

        for (int k = 1; k <= i; k++) {
            System.out.print("Please enter number " + k+": ");
            x = input.nextInt();
            if (k == 1) {
                min =x;
                max = x;
            }else{
                if(x<min)
                    min=x;
                if (x>max)
                    max=x;
            }
        }
        System.out.println("Biggest number is: "+max);
        System.out.println("Smallest number is: "+min);
    }
}
