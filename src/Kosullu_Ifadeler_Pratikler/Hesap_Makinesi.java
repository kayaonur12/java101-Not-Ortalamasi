package Kosullu_Ifadeler_Pratikler;

import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, selection;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz:");
        sayi1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz:");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemin rakamını giriniz: ");
        selection = input.nextInt();

        switch (selection) {
            case 1:
                System.out.print("Toplama İşlemi Sonucu: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.print("Çıkarma İşlemi Sonucu: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.print("Çarpma İşlemi Sonucu: " + (sayi1 * sayi2));
                break;
            case 4:
                switch (sayi2) {
                    case 0:
                        System.out.print("Bir sayı 0'a bölünemez");
                        break;
                    default:
                        System.out.print("Bölme İşlemi Sonucu: " + (sayi1 / sayi2));
                }
                break;
            default:
                System.out.println("Hatali Girdi");
        }
/*
        if (selection == 1) {
            System.out.print("Toplama İşlemi Sonucu: " + (sayi1 + sayi2));
        } else if (selection == 2) {
            System.out.print("Çıkarma İşlemi Sonucu: " + (sayi1 - sayi2));
        } else if (selection == 3) {
            System.out.print("Çarpma İşlemi Sonucu: " + (sayi1 * sayi2));
        } else if (selection == 4) {
            if (sayi2 != 0) {
                System.out.print("Bölme İşlemi Sonucu: " + (sayi1 / sayi2));
            } else {
                System.out.print("Bir sayı 0'a bölünemez");
            }
        } else {
            System.out.println("Hatali Girdi");
        }
  */
    }

}