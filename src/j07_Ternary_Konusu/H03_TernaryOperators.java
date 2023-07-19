package j07_Ternary_Konusu;

import java.util.Scanner;

public class H03_TernaryOperators {
    public static void main(String[] args) {
        // Task 1 : girilen bir tamsayının ciftse yarısını , tek ise iki katını print eden code
        // yazınız (ternary ile yapılacak)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int sayi = scanner.nextInt();
        String sonuc1   = sayi%2==0 ? "Sonuc= "+(sayi/2) : "sonuc= "+(sayi*2);
        int sonuc2      = (sayi % 2 == 0) ? (sayi / 2) : (sayi * 2);
        System.out.println(sonuc2);
        // Task 2 : girilen bir tamsayının ciftse yarısını tek ise "tek sayı bölünmez" yazdırınız
        String sonuc3   = sayi%2==0 ? "Sonuc= "+(sayi/2) : "tek sayı bölünmez ";
        Object sonuc4   = (sayi % 2 == 0) ? (sayi / 2) :"tek sayı bölünmez ";
    }
}
