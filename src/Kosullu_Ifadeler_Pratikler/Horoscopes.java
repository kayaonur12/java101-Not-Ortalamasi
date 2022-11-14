package Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class Horoscopes {
    public static void main(String[] args) {
        String horo = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth month in numbers: ");
        int month = input.nextInt();
        System.out.print("Please enter your birth day in numbers: ");
        int day = input.nextInt();
        boolean isError = false;


        if (month < 1 || month > 12 || day < 1) {
            System.out.println("False input");
        } else if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day <= 20)) {
            horo = "Aries";
        } else if ((month == 4 && day <= 30) || (month == 5 && day <= 21)) {
            horo = "Taurus";
        } else if ((month == 5 && day <= 31) || (month == 6 && day <= 22)) {
            horo = "Gemini";
        } else if ((month == 6 && day <= 30) || (month == 7 && day <= 22)) {
            horo = "Cancer";
        } else if ((month == 7 && day <= 31) || (month == 8 && day <= 22)) {
            horo = "Leo";
        } else if ((month == 8 && day <= 31) || (month == 9 && day <= 22)) {
            horo = "Virgo";
        } else if ((month == 9 && day <= 30) || (month == 10 && day <= 22)) {
            horo = "Libra";
        } else if ((month == 10 && day <= 31) || (month == 11 && day <= 21)) {
            horo = "Scorpio";
        } else if ((month == 11 && day <= 30) || (month == 12 && day <= 21)) {
            horo = "Sagittarius";
        } else if ((month == 12 && day <= 31) || (month == 1 && day <= 21)) {
            horo = "Capricorn";
        } else if ((month == 1 && day <= 31) || (month == 2 && day <= 19)) {
            horo = "Aquarius";
        } else if ((month == 2 && day <= 29) || (month == 3 && day <= 20)) {
            horo = "Pisces";
        } else {
            isError = true;
        }
        if (isError) {
            System.out.println("False input");
        } else {
            System.out.println("Your horoscope is: " + horo);
        }

    }
}

