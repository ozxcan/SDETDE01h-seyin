package j03_ScannerClass_And_TypeCasting;


import java.util.Scanner;

public class C02_ScannerClass_String {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Bunu sadece tek kelime okutmak isteyince kullan.
        Scanner scanLine = new Scanner(System.in); //Bunu tüm cümle okutmak isteyince kullan

        //Scanner Class kullanıcıdan veri almak için kulandığımız bir class'tır.

        System.out.print("Isminizi giriniz: ");
        String isim = scan.next(); //Nextline girilen tam satırı okur, next ise sadece girilen tek kelimeyi okur
        System.out.println(isim);










    }
}
