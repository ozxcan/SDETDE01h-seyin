package j10_String_Manipulation;

import java.util.Scanner;

public class C04_Exp {
    public static void main(String[] args) {

        /* ÖRNEK
        Ekrandan girilen bir stringin 3. INDEKSİNİ büyük harf olarak yazdırın
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni yazınız: ");
        String str = scanner.next();
        // metin = selamlar olsun diyelim
        System.out.println(str.toUpperCase().charAt(3)); // Sonucu A olarak verir.





    }
}
