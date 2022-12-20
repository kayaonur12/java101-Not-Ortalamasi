package Arrays;

import java.util.Arrays;


public class RepeadedNumbers {

    static boolean isDuplicate(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {5, 9, 8, 13, 4, 8, 9, 6, 7, 8, 3, 2, 5, 11, 13, 15, 8};
        int[] list2 = new int[list.length];
        Arrays.sort(list);
        System.out.println("Inıtial sorted array is:\t" + Arrays.toString(list));

        int m = 0;
        for (int i = 0; i < (list.length); i++) {
            for (int j = 0; j < list.length; j++) {
                if ((j > i) && (list[i] == list[j]) && isDuplicate(list2, list[i]) && (list[i] % 2 == 0)) {
                    list2[m++] = list[i];
                    break;
                }
            }
        }

        System.out.println("Duplicated even numbers are:\t" + Arrays.toString(list2));
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list2[i] != 0)
                count++;
        }

        int[] list3 = Arrays.copyOf(list2, count);
        System.out.println("Final Array of Duplicated Numbers is:\t" + Arrays.toString(list3));

/*      An alternative code which writes the repeated numbers, but it is not best if last number is also repeated
        for (int i = 0; i < (list.length - 1); i++) {
            if (list[i] == list[i + 1]) {
                System.out.println(list[i]);
                        while (list[i + 1] == list[i + 2])
                                i++;
                }
            }
 */

    }
}

