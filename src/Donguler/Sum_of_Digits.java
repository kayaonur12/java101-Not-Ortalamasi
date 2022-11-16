package Donguler;
import java.util.Scanner;
public class Sum_of_Digits {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number: ");
        double entry = input.nextDouble();


        while (entry>=1){
            n= (int)(entry%10);
            sum +=n;
            entry/=10;
        }
        System.out.println("Total is: "+sum);
    }
}
