package j10_String_Manipulation.Tasks;

import java.util.Scanner;

public class _01_StringMethods {
    public static void main(String[] args) {
        // ekrandan bir cümle giriş yapın,
        // içerisinde bir  kelimenin olup olmadığını kotrol edin
        // ornek input : cumle="Merhaba nasılsın ali" , kelime="ali"

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = scan.nextLine().toLowerCase();
        System.out.print("Aranacak kelime: ");
        String kelime = scan.nextLine();


        if (cumle.indexOf(kelime) == -1) { // cumlenin içinde merhaba yoksa, indexOf() eksi 1 olarak sonuc verir.
            System.out.println("Cümlenin içinde "+kelime+" yoktur");

        } else {
            System.out.println("Cümlenin içinde "+kelime+" vardır.");

        }










    }
}
