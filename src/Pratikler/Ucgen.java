package Pratikler;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        double kenar1,kenar2,kenar3;

        Scanner input = new Scanner(System.in);
        System.out.println("1. ve 2. Kenar Uzunluğunu Girip Ayrı Ayrı Entera Basın");
        kenar1 = input.nextDouble();
        kenar2 = input.nextDouble();
        kenar3 = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs= "+kenar3);


        //Ödev:

        double a,b,c,u,Alan;
        System.out.println("1., 2. ve 3. Kenar Uzunluğunu Girip Ayrı Ayrı Entera Basın");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        u = (a+b+c)/2;
        Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Girilen Kenarlara Göre Üçgenin Alanı: "+Alan);

    }
}
