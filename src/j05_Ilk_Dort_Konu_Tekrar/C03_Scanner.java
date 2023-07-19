package j05_Ilk_Dort_Konu_Tekrar;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {


        //Task5

        // 2 sayıyı ekrandan okutun, çarpımlarını yazdırın
        // Sonuc = ?? 'dir //şeklinde çıktı versin

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        int result = sayi1 * sayi2;
        int result2 = Math.multiplyExact(sayi1,sayi2);
        System.out.println("Sonuc: " + result);
        System.out.println("Sonuc: " + result2);
        System.out.println();
        System.out.println();

    }
}
