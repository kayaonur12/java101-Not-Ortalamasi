package Metotlar;

import java.util.Scanner;

public class Palindrome {
    static String isPalindrome(int a) {
        int temp = a, reverse = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverse = reverse * 10 + lastNumber;
            temp /= 10;
        }
        String result = reverse == a ? a + " is a Palindrome number." : a + " is not a Palindrome number.";
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Please indicate the number that you want to check if it is Palindrome number or not: ");
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        System.out.println(isPalindrome(b));
    }
}
