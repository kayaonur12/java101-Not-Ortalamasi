package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class NearestSmallerBigger {
    public static void main(String[] args) {
        int[] list = {78, 8, 12, 19, 23, 999};
        int less = list[0], more = list[0];

        Arrays.sort(list);
        System.out.println("Sorted list as seen here: "+Arrays.toString(list));
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = input.nextInt();

        for (int i :
                list) {

            if (i < a) {
                less = i;
            }

            if (i > a) {
                more = i;
                break;
            } else more = list[list.length - 1];
        }

        if (a > more)
            System.out.println("There is no bigger number!");
        else System.out.println("Nearest bigger number is: " + more);

        if (a < less)
            System.out.println("There is no smaller number!");
        else System.out.println("Nearest smaller number is: " + less);
    }
}
