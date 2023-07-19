package j10_String_Manipulation.Tasks;

import java.util.Scanner;

public class _02_StringMethods {
    public static void main(String[] args) {
        // ekrandan bir string grişi yapın, içersinde "a" olupup olmadığını
        // kotrol edin varsa yazdırın ve
        // bir den fazla a varsa kaçıncı a yazdığını gözlemleyin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scanner.nextLine().toLowerCase();

        if (str.indexOf("a") == -1) { //cumlenin içinde 'a' yoksa, indexOf() eksi 1 olarak sonuc verir.
            System.out.println("Cümlenin içinde \"a\" yoktur");

        } else {
            System.out.println("Cümlenin içinde 'a' vardır ve a indeksi " +str.indexOf("a")+" bulunur.");

        }



    }
}
