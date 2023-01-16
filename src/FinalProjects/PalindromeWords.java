package FinalProjects;

import java.util.*;

public class PalindromeWords {

    static boolean isPalindrome(String word){
        int j = word.length()-1;
        int i = 0;
        while (i < j){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2 (String word){
        String reverse = "";
        for (int i=word.length()-1;i>=0;i--){
            reverse += word.charAt(i);
        }
        return word.equals(reverse);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the input you want to check if it is Palindrome or not: ");
        String word = input.next();

        if (isPalindrome2 (word))
            System.out.println("The word you entered is Palindrome!");
        else
            System.out.println("The word you entered is not Palindrome!");
    }
}