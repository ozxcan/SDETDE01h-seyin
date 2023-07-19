package j09_Ilk_Sekiz_Ders_Degerlendirme;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*  Klavyeden okutulan ondalıklı bir sayının , ondalık kısmını ekran yazdırınız
        Örnek : input : 3.435 , output : 0.435
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ondalık bir sayı giriniz: ");
        double sayi = scan.nextDouble();

        double ondalik = sayi % 1;
        System.out.println("Sayinin ondalik kismi " + ondalik);
        System.out.println(" ******* ");

        /* Cözüm IKi
        Burada ilk önce double sayıyı int e çeviriyoruz.
        Sonra double olan sayıdan int olan sayıyı çıkarınca bizim elimizde
        sadece ondalık kısım kalıyor.
         */

       int a = (int) sayi;
        System.out.println("Sayının ondalık kısmı " + (sayi-a));















    }
}
