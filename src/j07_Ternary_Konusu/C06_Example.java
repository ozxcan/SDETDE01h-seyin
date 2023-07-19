package j07_Ternary_Konusu;

import java.util.Scanner;

public class C06_Example {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.print("Uzun kenarı giriniz: ");
        int uzunK = scan.nextInt();

        System.out.print("Kısa kenarı giriniz: ");
        int kisaK = scan.nextInt();

        String sonuc = (uzunK == kisaK) ? "karedir." : "kare değildir.";
        System.out.println("Girelen değerlere göre " + sonuc  );
        System.out.println();
        System.out.println((uzunK == kisaK) ? "karedir." : "kare değildir.");
















    }
}
