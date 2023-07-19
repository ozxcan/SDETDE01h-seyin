package j07_Ternary_Konusu;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        // Sayı 0'dan büyükse ekrana .... yazdır, küçükse .... yazdır.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int sonuc = ( num > 0 ) ? 1 : -1;
        System.out.println(sonuc);
        System.out.println();

        String sonuc2 = ( num > 0) ? "Pozitif" : "Negatif";
        System.out.println(sonuc2);














    }
}
