package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;



public class Task09 {

    public static void main(String[] args) {

    /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double a = scan.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double b = scan.nextDouble();

        System.out.print("Üçüncü sayıyı giriniz: ");
        double c = scan.nextDouble();

        double sonuc = (Math.pow(a, 2)-Math.pow(b, 2))/Math.pow(c,3);
        System.out.println("İşlem sonucu "+sonuc );






    }
}
