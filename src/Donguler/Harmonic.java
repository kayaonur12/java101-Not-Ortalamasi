package Donguler;
import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        double n,sum=0.0,entry;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        entry= input.nextDouble();

        for (double i =1;i<=entry;i++){
            n =1/i;
            sum +=n;
        }
        System.out.println("Harmonic sum is: "+sum);
    }
}
