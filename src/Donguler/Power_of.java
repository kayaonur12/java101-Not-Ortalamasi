package Donguler;
import java.util.Scanner;
public class Power_of {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        int total=1;

        for (int i =1;i<=power;i++)
            total *=number;
        System.out.println("Answer is: "+total);
    }
}
