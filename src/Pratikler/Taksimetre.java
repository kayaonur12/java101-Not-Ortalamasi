package Pratikler;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int Mesafe;
        double YolBedeli, Tutar, kmfiyat = 2.2, Acilis = 10, MinOdeme = 20;
        Scanner input = new Scanner(System.in);
        System.out.print("Taksinin Kullanım Mesafesini km Bazında Giriniz");
        Mesafe = input.nextInt();

        YolBedeli = Mesafe*kmfiyat;
        Tutar = Math.max((Acilis + YolBedeli), MinOdeme);

        System.out.println("Ödenecek Bedel: "+Tutar);

        /*other way around

        int km;
        double Total;
        System.out.print("km yaz ");
        km = input.nextInt();
        Total = kmfiyat*km;
        Total += Acilis;
        Total = Total>20 ? Total : 20;
        System.out.println("Ödenecek Bedel: " + Total);
        //System.out.println(Total>20 ? Total : 20); "Ödenecek Bedel" yazdırmak istemesen sout içinde de malgoritma yazabiliyorsun

         */
    }
}
