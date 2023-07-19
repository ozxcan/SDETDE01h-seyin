package j07_Ternary_Konusu;

import java.util.Scanner;

public class C10_Examples {
    public static void main(String[] args) {
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz: ");
        int yas = input.nextInt();

        String sonuc = ( yas <= 4) ? "Bebek" : ((yas <= 12) ? "Cocuk" : ((yas <= 20) ? "Genc" : ((yas <= 30) ? "Yetiskin" : "Tanımlanmamıs evre")));
        System.out.println(sonuc);
        System.out.println();

        // ORNEK 2

        // Task-> girilen bir tamsayının ciftse yarısını , tek ise iki katını print eden code
        // yazınız (ternary ile yapılacak)

        System.out.print("Tam sayi giriniz: ");
        int sayi = input.nextInt();

        int sonuc2 = sayi % 2 == 0 ? sayi/2 : sayi*2;
        System.out.println(sonuc2);
        System.out.println();

        // ORNEK 3

        // Girilen bir tam sayının çiftse yarısını, tek ise "tek sayı bölünmez" yazdırınız.

        String sonuc3 = sayi % 2 == 0 ? "Sonuc " + sayi/2 : "Tek sayı bölünmez";
        Object sonuc4 = sayi % 2 == 0 ? sayi/2 : "Tek sayı bölünmez"; // Object ile aynı soruda hem int hem de string, yani karışık veri tiplerini yazdırabiliriz
        System.out.println(sonuc3);
        System.out.println(sonuc4);
















    }
}
