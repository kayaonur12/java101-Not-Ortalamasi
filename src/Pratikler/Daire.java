package Pratikler;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double pi =3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Alan ve Çevresini hesaplama istediğiniz yarıçapı giriniz: ");
        r = input.nextInt();

        double Alan = r*r*pi; //Math.PI
        double Cevre = 2*r*pi;
        System.out.println("Dairenin Alanı: "+Alan+"\nDairenin Çevresi: "+Cevre);

        //ödev

        System.out.print("Yarıçapı girilmiş dairenin alanını hesaplamak istediğiniz kesitine ait açısını giriniz: ");
        double aci = input.nextDouble();
        System.out.println("Verilen Açınıya Ait Daire Kesitinin Alanı: "+ r*r*pi*aci/360);

    }
}
