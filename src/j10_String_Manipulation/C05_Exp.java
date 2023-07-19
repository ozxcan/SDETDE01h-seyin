package j10_String_Manipulation;

import java.util.Scanner;

public class C05_Exp {
    public static void main(String[] args) {
        /* ÖRNEK
        Ekrandan isim ve soyisim tek boşluk ile okutunuz. İsim ve soyisimden uzun olan
        kaç karakterdir.
         */
        // önce boşluğu bul
        // sonra boşluktan önceki karakter sayısı bul (int a)
        // sonra boşluktan sonraki karakter sayısı bul(int b)
        // büyük olanını ekrana yazdır.
        // isim = Hüseyin Ince


        Scanner scan = new Scanner(System.in);
        System.out.println("İsim ve soyisim giriniz: ");
        String isim = scan.nextLine();

        int bosluk = isim.indexOf(" ");
        int ad = bosluk-0; // bu boşluğa kadar olan karakter sayısıdır aynı zamanda. Yani isimdir de.
        int soyad = isim.length() - 1 - ad; // isminve soyismin tüm uzunlugundan, ismi(yani boşluga kadar olan kısmı)
                                            // ve -1 yaparakta son indeksi buluyoruz. bu ikisi arasındaki de soy isim oluyor.
        System.out.println(Math.max(ad, soyad));


    }
}
