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
            i ++;
            sum += grade;
        }
        n ++;

        System.out.print("Please enter your Physics Grade: ");
        grade = input.nextInt();
        if (grade >= 0 && grade <= 100) {
            i ++;
            sum += grade;
        }
        n ++;

        System.out.print("Please enter your Turkish Grade: ");
        grade = input.nextInt();
        if (grade >= 0 && grade <= 100) {
            i ++;
            sum += grade;
        }
        n ++;

        System.out.print("Please enter your Chemistry Grade: ");
        grade = input.nextInt();
        if (grade >= 0 && grade <= 100) {
            i ++;
            sum += grade;
        }
        n ++;

        System.out.print("Please enter your Music Grade: ");
        grade = input.nextInt();
        if (grade >= 0 && grade <= 100) {
            i ++;
            sum += grade;
        }
        n ++;

        if (i == 0) {
            System.out.println("All inputs are invalid . Your grade entries should be between 0 and 100. Please reinitiate the program!");
        } else {
            double ave = sum / i;
            System.out.println("Your Overall Grade is: " + ave);
            if (ave > 55 && i==n) {
                System.out.println("You Passed!");
            } else {
                System.out.println("You Failed!");
            }
            if (i < n)
                System.out.println((n-i) + " of your grades has not been considered (grade entries should be between 0 and 100)");
        }

    }
}
