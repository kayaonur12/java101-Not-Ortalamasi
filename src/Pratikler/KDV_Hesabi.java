package Pratikler;

import java.util.Scanner;

public class KDV_Hesabi {
    public static void main(String[] args) {
        double fiyat, KDV;

        Scanner input = new Scanner(System.in);
        System.out.print("KDV'sinin hesaplanmasını istediğiniz tutarı giriniz: ");
        fiyat = input.nextDouble();
        KDV = fiyat>=1000 ? 0.08 : 0.18;
        System.out.println( "KDV'siz Tutar: "+fiyat+"\nKDV Tutarı(%"+KDV*100+"): "+fiyat*KDV+"\nKDV'li Tutar: "+fiyat*(1.0+KDV));
    }
}
