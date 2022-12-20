package Arrays;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20, 25};

        System.out.println("Given array is: " + Arrays.toString(list));

        Arrays.sort(list);
        System.out.println("Sorted array is: " + Arrays.toString(list));

        int count =0;

        int m = (list[0]-1);

        for (int i : list) {
            if (m != i) {
                for (int k : list
                ) {
                    if (i == k) {
                        count++;
                        m = k;
                    }
                }
                System.out.println(i + " repeated " + count + " times.");
                count = 0;
            }
        }

    }
}








/* alternatif
    static boolean isDuplicated(int[] array, int value) {
        for (int i :
                array) {
            if (i == value)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20, 25};
        int[] list2 = new int[list.length];

        System.out.println("Given array is: " + Arrays.toString(list));

        Arrays.sort(list);
        System.out.println("Sorted array is: " + Arrays.toString(list));

        System.out.println("*Frequencies of the array elements*");
        int n = 0;
        for (int k : list) {
            int m = 1;
            if (isDuplicated(list2, k)) {
                for (int j = 0; j < list.length - 1; j++) {
                    if ((k == list[j]) && (list[j] == list[j + 1])) {
                        list2[n] = k;
                        m++;
                        n++;
                    }
                }
                System.out.println(k + " repeated " + m + " times.");
            }
        }
    }

 */

