package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan = new Scanner(System.in);
        System.out.print("Üçgenin bir dik kenarının uzunluğunu giriniz: ");
        double a = scan.nextDouble();

        System.out.print("Üçgenin ikinci dik kenarının uzunluğunu giriniz: ");
        double b = scan.nextDouble();

        double hipotenus =Math.hypot(a,b); //Hipotenüsü hesaplar.
        System.out.println("Hipotenus: "+hipotenus);




    }
}
