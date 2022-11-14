package Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the average temperature: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("You can go to skiing");
        } else if (heat <= 9) {
            System.out.println("You can go to cinema");
        } else if (heat <= 14) {
            System.out.println("You can go to cinema or picnic");
        } else if (heat <= 24) {
            System.out.println("You can go to picnic");
        } else {
            System.out.println("You can go to swimming");
        }
    }
}
