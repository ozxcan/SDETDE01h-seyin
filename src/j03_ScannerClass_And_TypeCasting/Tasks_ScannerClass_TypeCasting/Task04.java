package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Isim ve soyisminizi giriniz: ");
        String name = scan.nextLine();

        System.out.print("Yaşınızı giriniz: ");
        int age = scan.nextInt();

        System.out.print("Kilonuzu giriniz: ");
        int kilo = scan.nextInt();

        System.out.print("Boyunuzu giriniz: ");
        double boy = scan.nextDouble();

        System.out.print("Salona kaç ay gelmek istiyorsunuz: ");
        int salon = scan.nextInt();

        int price = 20 * salon;
        System.out.println("Toplam " + salon +"\'lık ücretiniz " + price + "$\'dır");



    }
}
