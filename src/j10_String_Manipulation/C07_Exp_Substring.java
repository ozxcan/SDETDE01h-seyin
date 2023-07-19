package j10_String_Manipulation;

import java.util.Scanner;

public class C07_Exp_Substring {
    public static void main(String[] args) {
        /*
        ÖRNEK
        isim ve soy isim veriliyor. Baş harflerini büyük harf yaparak ismi yazalım.

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Isim ve soy isim giriniz: ");
        String ad = scan.nextLine();

        int bosluk = ad.indexOf(" "); // Önce boşluğu bulduk
        String isimIlkHarf = ad.substring(0,1).toUpperCase(); // Sonra ismin ilk harfini bulup büyük yaptık.
        String isim = ad.toLowerCase().substring(1,(bosluk+1));// sonra ismin geri kalanını küçük yazdık boşluk dahil.
        String soyisimIlkHarf = ad.toUpperCase().substring(bosluk+1,bosluk+2);// sonra soyismin ilk harfini bulup büyük yaptık.
        String soyIsim = ad.toLowerCase().substring(bosluk+2);// Soyismin geri kalanını küçük yaptık.
        System.out.println(isimIlkHarf+isim+soyisimIlkHarf+soyIsim);



    }
}
