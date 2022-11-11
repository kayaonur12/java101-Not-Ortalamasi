package Pratikler;
import java.util.Scanner;
public class Vucut_Kitle_Indeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz: ");
        int kilo = input.nextInt();

        System.out.print("Boyunuzu Giriniz: ");
        double boy = input.nextDouble();

        System.out.println("Vücut Kitle Endeksiniz: " + kilo/boy/boy);

    }
}
