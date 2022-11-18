package Donguler;

import java.util.Objects;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        //this will be names and passwords lists when we learn arrays
        int password = 123456;
        String userName = "customer1";
        //definitions
        int attPassword, i, deposit, withdraw, realDeposit, k, l, m;
        int right = 3, balance = 1000, atmCash = 100, withdrawFactor = 100, depositFactor = 10;
        String attUserName, blockedUsers = "";
        Scanner input = new Scanner(System.in);
/*
Structure:
1.Wrong username attempts shouldn't be a reason for blockage (you wouldn't even know whom you would block at the end). That's why wrong input right only works for password.
2.After 3 wrong attempts customer gets blocked.
3.There is deposit restriction for allowed minimum cash.
4.There is an algorithm for physical deposit checking but for now it is not in force.
5.There is a variable for cash in the ATM and if that is less than minimum withdrawal amount it gives instruction to use another ATM.
6.If cash in ATM less than withdraw demand, it says maximum withdrawable amount to customer.
7.Withdraw doesn't work when it is bigger than cash in ATM.
*/

//Username control part
        boolean userNameAttempt = true;
        while (userNameAttempt) {
            System.out.print("Enter your user name: ");
            attUserName = input.next();
            if (Objects.equals(attUserName, blockedUsers))  //checked if user already blocked.If blocked, redirected to name section.
                System.out.println("You had 3 wrong password attempts already. Please contact to bank!\n-----------");
            else if (!attUserName.equals(userName)) { // checked if the username is true or false. If false, redirected to name section.
                System.out.print("Wrong username attempt. ");
            } else {
//Password control part
                boolean passwordAttempt = true;
                while (passwordAttempt) {
                    System.out.print("Enter your password: ");
                    attPassword = input.nextInt();
                    if (attPassword != password) {
                        right--;
                        if (right > 1)
                            System.out.println("Wrong password attempt. You have " + right + " attempt right!");
                        else {
                            System.out.println("You had 3 wrong password attempt. Please contact to bank!\n-----------");
                            passwordAttempt = false;
                            blockedUsers = attUserName;
                        }
//We are in the system now.
                    } else {
                        System.out.println("Welcome to Onur Bank Mr./Mrs. " + userName + "\n-----------");
                        i = 0;
                        right = 3;
                        while (i != 4) {
                            System.out.print("What would you like to do?\nPress 1 to check your balance.\nPress 2 to deposit.\nPress 3 to withdraw money.\nPress any other number to exit: ");
                            i = input.nextInt();
                            if (i == 1)
                                System.out.println("Your balance is: " + balance + "\n-----------");
                            else if (i == 2) {
                                do {
                                    System.out.print("Please submit how much you would like to deposit: ");
                                    deposit = input.nextInt();
                                    realDeposit = deposit; //I just created the algorithm. There should be a physical checking system of course.
                                    if (deposit == realDeposit) {
                                        if (deposit % depositFactor == 0 && deposit > 0) {
                                            balance += deposit;
                                            atmCash += deposit;
                                            System.out.println("Your deposit is successful!");
                                        } else {
                                            System.out.println("Your deposit should be multiple of " + depositFactor);
                                            System.out.println("Take the money.");
                                            //add press 1 to say you are done etc.
                                        }
                                    } else {
                                        System.out.println("Deposed amount is " + realDeposit + ". Do you approve.\nPress 1 to approve. Press 2 to disapprove: ");
                                        k = input.nextInt();
                                        if (k == 1) {
                                            balance += deposit;
                                            atmCash += deposit;
                                            System.out.println("Your deposit is successful!");
                                        }
                                    }
                                    System.out.print("Press 1 to depose. Press any other button to go back to menu: ");
                                    k = input.nextInt();
                                } while (k == 1);
                            } else if (i == 3) {
                                do {
                                    if (atmCash < withdrawFactor) {
                                        System.out.println("-----------\nPlease use another ATM for withdrawal. You will be redirected to main menu.\n-----------");
                                        break;
                                    } else {
                                        System.out.print("Please submit how much you would like to withdraw: ");
                                        withdraw = input.nextInt();
                                        if (withdraw > balance)
                                            System.out.println("Your account balance is not enough. ");
                                        else if (withdraw % withdrawFactor != 0)
                                            System.out.println("Withdraw amount should be multiple of " + withdrawFactor);
                                        else if (withdraw > atmCash)
                                            System.out.println("You can withdraw maximum " + atmCash);
                                        else {
                                            balance -= withdraw;
                                            atmCash -= withdraw;
                                            System.out.println("Please take the money.");
                                        }
                                    }
                                    System.out.print("Press 1 to withdraw. Press any other button to go back to menu: ");
                                    l = input.nextInt();
                                } while (l == 1);
                            } else
                                i = 4;
                            passwordAttempt = false;
                        }
                    }
                }
            }
            System.out.print("Would you like to redirected to login page?\nPress 1 to go to login page. Press any other button to exit: ");
            m = input.nextInt();
            if (m == 1) {
                System.out.println("You are getting directed to login page.\n-----------");
            } else
                userNameAttempt = false;
        }
        System.out.println("Thank you for using Onur Bank!");
    }
}