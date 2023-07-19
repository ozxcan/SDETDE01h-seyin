package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         */

        Scanner scan = new Scanner (System.in);
        System.out.print("Boyunuzu cm olarak giriniz: ");
        double boy = scan.nextDouble();

        System.out.print("Kilonuzu kilogram olarak giriniz: ");
        int kilo = scan.nextInt();

        int kütleEndeksiTam= (int) (kilo/(boy*boy));
        double kütleEndeksiOndalık = kilo/(boy*boy);
        System.out.println("Vücut kütle endeksiniz: " + kütleEndeksiTam);
        System.out.println("Vücut kütle endeksiniz: " + kütleEndeksiOndalık);




    }
}
