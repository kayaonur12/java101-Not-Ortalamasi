package Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        int grade, i = 0, n = 0;
        double sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your Mathematics Grade: ");
        grade = input.nextInt();
        if (grade >= 0 && grade <= 100) {
            i += 1;
            sum += grade;
        }
        n += 1;

        System.out.print("Please enter your Physics Grade: ");
        grade = input.nextInt();
        if (grade >= 0 && grade <= 100) {
            i += 1;
            sum += grade;
        }
        n += 1;

        System.out.print("Please enter your Turkish Grade: ");
        grade = input.nextInt();
        if (grade >= 0 && grade <= 100) {
            i += 1;
            sum += grade;
        }
        n += 1;

        System.out.print("Please enter your Chemistry Grade: ");
        grade = input.nextInt();
        if (grade >= 0 && grade <= 100) {
            i += 1;
            sum += grade;
        }
        n += 1;

        System.out.print("Please enter your Music Grade: ");
        grade = input.nextInt();
        if (grade >= 0 && grade <= 100) {
            i += 1;
            sum += grade;
        }
        n += 1;

        if (n != i) {
            System.out.println("One or more invalid input. Your grade entries should be between 0 and 100. Please reinitiate the program!");
        } else {
            double ave = sum / i;
            System.out.println("Your Overall Grade is: " + ave);
            if (ave > 55) {
                System.out.print("You Passed!");
            } else {
                System.out.print("You Failed!");
            }
        }
    }
}
