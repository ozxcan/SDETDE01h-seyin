package j09_Ilk_Sekiz_Ders_Degerlendirme;

import java.util.Scanner;


public class Task03 {
    public static void main(String[] args) {
        /* Klavyeden girilen 3 double sayının toplamını Wrapper class yardımı ile yazdırınız.
        toplama '+' işareti kullanılmayacak.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        double a = scan.nextDouble();
        System.out.print("Bir sayı daha giriniz: ");
        double b = scan.nextDouble();
        System.out.print("Bir sayı daha giriniz: ");
        double c = scan.nextDouble();


        System.out.println("Toplam: " + (Double.sum( a, (Double.sum(b,c)))));


    }
}
