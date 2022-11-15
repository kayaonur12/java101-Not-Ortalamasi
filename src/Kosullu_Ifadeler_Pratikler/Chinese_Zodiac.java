package Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class Chinese_Zodiac {
    public static void main(String[] args) {
        int year;
        boolean isError = false;
        String zodiac = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth year: ");
        year = input.nextInt();
        year = year % 12;


        switch (year) {
            case (0):
                zodiac = "Monkey";
                break;
            case (1):
                zodiac = "Rooster";
                break;
            case (2):
                zodiac = "Dog";
                break;
            case (3):
                zodiac = "Pig";
                break;
            case (4):
                zodiac = "Rat";
                break;
            case (5):
                zodiac = "Ox";
                break;
            case (6):
                zodiac = "Tiger";
                break;
            case (7):
                zodiac = "Rabbit";
                break;
            case (8):
                zodiac = "Dragon";
                break;
            case (9):
                zodiac = "Snake";
                break;
            case (10):
                zodiac = "Horse";
                break;
            case (11):
                zodiac = "Goar";
                break;
            default:
                isError = true;
        }
        if (isError) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Your Chinese Zodiac is " + zodiac);
        }
    }
}
