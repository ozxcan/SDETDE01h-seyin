package j13_Method_Creation.Sorular;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        // Soru 1) Kullanicidan bir sifre girmesini isteyin.
                 Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",
                    - sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin
                    - Ilk harf buyuk harf olmali
                    - Son harf kucuk harf olmali
                    - Sifre bosluk icermemeli
                    - Sifre uzunlugu en az 8 karakter olmali
                bu 4 kontrolu method ile yapin

         */

        System.out.print("Bir şifre girin: ");
        String pass = scan.nextLine();

        boolean sifre = ilkHarfBuyukMu(pass);
        boolean harf = sonHarfKucukMu(pass);
        boolean uzunluk = uzunluk(pass);
        boolean bosluk = boslukVarMi(pass);

        if (sifre && harf && uzunluk && bosluk) System.out.println("Şifre başari ile tanimlandi.");
        else System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin.");


    }

    public static boolean ilkHarfBuyukMu(String str) {

        boolean sonuc = true;
        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {

            sonuc = true;
        } else sonuc = false;

        return sonuc;
    }
    public static boolean sonHarfKucukMu(String ll) {
        boolean sonuc = true;
        if (ll.charAt(ll.length() - 1) >= 'a' && ll.charAt(ll.length() - 1) <= 'z') {
            sonuc = true;
        } else sonuc = false;
        return sonuc;
    }
    public static boolean uzunluk (String str) {
        boolean sonuc = true;
        if (str.length() >= 8) {
           sonuc= true;
        } else sonuc = false;
        return sonuc;
    }
    public static boolean boslukVarMi(String str) {
        boolean sonuc = true;
        if (!str.contains(" ")) {
            sonuc = true;

        } else sonuc = false;
        return sonuc;
    }


}
