package Metotlar;

import java.util.Scanner;

// This calculator can do subsequent calculations by using previous calculation result.

public class Calculator {
    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Result is: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Result is: " + result);
        return result;
    }

    static int multiple(int a, int b) {
        int result = a * b;
        System.out.println("Result is: " + result);
        return result;
    }

    static int division(int a, int b) {
        int result = a / b;
        System.out.println("Result is: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++)
            result *= a;
        System.out.println("Result is: " + result);
        return result;
    }

    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Result is: " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Result is: " + result);
        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, a, b, i = 0, output = 0;


        do {
            System.out.print("""
                    Please select what would you like to do from below mentioned calculations.
                    1- Addition
                    2- Subtraction
                    3- Multiplication
                    4- Division
                    5- Power
                    6- Factorial
                    7- Mod
                    8- Clear
                    9- Exit
                    """);
            n = input.nextInt();

            i++;
            if (n == 1) {
                if (i == 1) {
                    System.out.print("Please indicate the first number: ");
                    a = input.nextInt();
                } else {
                    System.out.println("First number is: " + output);
                    a = output;
                }
                System.out.print("Please indicate second number: ");
                b = input.nextInt();
                output = plus(a, b);
            } else if (n == 2) {
                if (i == 1) {
                    System.out.print("Please indicate the first number: ");
                    a = input.nextInt();
                } else {
                    System.out.println("First number is: " + output);
                    a = output;
                }
                System.out.print("Please indicate second number: ");
                b = input.nextInt();
                output = minus(a, b);
            } else if (n == 3) {
                if (i == 1) {
                    System.out.print("Please indicate the first number: ");
                    a = input.nextInt();
                } else {
                    System.out.println("First number is: " + output);
                    a = output;
                }
                System.out.print("Please indicate second number: ");
                b = input.nextInt();
                output = multiple(a, b);
            } else if (n == 4) {
                if (i == 1) {
                    System.out.print("Please indicate the first number: ");
                    a = input.nextInt();
                } else {
                    System.out.println("First number is: " + output);
                    a = output;
                }
                System.out.print("Please indicate second number: ");
                b = input.nextInt();
                output = division(a, b);
            } else if (n == 5) {
                if (i == 1) {
                    System.out.print("Please indicate the base: ");
                    a = input.nextInt();
                } else {
                    System.out.println("The base is: " + output);
                    a = output;
                }
                System.out.print("Please indicate the exponent: ");
                b = input.nextInt();
                output = power(a, b);
            } else if (n == 6) {
                if (i == 1) {
                    System.out.print("Please indicate the factorial number: ");
                    a = input.nextInt();
                } else {
                    System.out.println("The factorial number is: " + output);
                    a = output;
                }
                output = factorial(a);
            } else if (n == 7) {
                if (i == 1) {
                    System.out.print("Please indicate the number: ");
                    a = input.nextInt();
                } else {
                    System.out.println("The number is: " + output);
                    a = output;
                }
                System.out.print("Please indicate the mod: ");
                b = input.nextInt();
                output = mod(a, b);
            } else {
                i = 0;
            }
        } while (n != 9);
        System.out.println("Thanks for using our calculator");
    }
}