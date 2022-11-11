package Pratikler;
import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo: ");
        double A = input.nextDouble()*2.14;
        System.out.print("Elma Kaç Kilo: ");
        double E = input.nextDouble()*3.67;
        System.out.print("Domates Kaç Kilo: ");
        double D = input.nextDouble()*1.11;
        System.out.print("Muz Kaç Kilo: ");
        double M = input.nextDouble()*0.95;
        System.out.print("Patlican Kaç Kilo: ");
        double P = input.nextDouble()*5;
        System.out.println("Toplam Tutar: "+ (A+E+D+M+P)+" TL");
    }
}
