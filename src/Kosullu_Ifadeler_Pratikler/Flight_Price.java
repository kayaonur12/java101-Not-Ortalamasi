package Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class Flight_Price {
    public static void main(String[] args) {
        int km, age, trip;
        double priceperkm = 0.10, total = 0, discount = 0;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter destination distance in km: ");
        km = input.nextInt();
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        System.out.print("Please enter trip type (1 = one way, 2 = two way): ");
        trip = input.nextInt();

        if (km > 0 && age > 0 && (trip == 1 || trip == 2)) {
            total = km * priceperkm * trip;
            if (age < 12) {
                total = total * 0.5;
            } else if (age < 24) {
                total = total * 0.9;
            } else if (age > 65) {
                total = total * 0.3;
            }
            if (trip == 2) {
                total = total * 0.8;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Wrong Input");
        } else {
            System.out.println("Total Price = " + (total - discount) + "TL");
        }
    }
}
