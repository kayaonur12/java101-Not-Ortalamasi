package Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String name = "coder", name_input, password = "my password", new_password, password_input, change;

        Scanner input = new Scanner(System.in);
        System.out.print("enter your ID: ");
        name_input = input.nextLine();
        System.out.print("enter your password: ");
        password_input = input.nextLine();

        if (name_input.equals(name)) {
            if (password_input.equals(password)) {
                System.out.print("Welcome");
            } else {
                System.out.print("Wrong password. Would you like to change your password (\"yes\" or \"no\"): ");
                change = input.nextLine();
                if (change.equals("yes")) {
                    System.out.print("Please enter your new password: ");
                    new_password = input.nextLine();
                    if (new_password.equals(password) || new_password.equals(password_input)) {
                        System.out.println("Your new password can not be the same with your old one or your resent attempt. Please enter another password.");
                    } else {
                        System.out.println("Your password changed successfully.");
                        password = new_password;
                    }
                }
            }
        } else {
            System.out.println("Wrong ID");
        }
    }
}

