package Arrays;

import java.util.*;

public class Sorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please indicate the arrays length: ");
        int arrayLength = input.nextInt();
        int[] list = new int[arrayLength];

        int i = 0;
        while (i < arrayLength) {
            System.out.print("Please indicate the element "+ (i + 1)+": ");
            list[i] = input.nextInt();
            i++;
        }

        //Alternative code to Array.sort

        int suspension, k, j;
        for (k = 0; k < list.length; k++) {
            for (j = k; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    suspension = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = suspension;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}

