package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class Task04_CharacterMethod_Kullanimi {

    public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir character giriniz: ");
        char ch = scan.next().charAt(0); // scan.next() ifadesi ekrandan string alır.
        // girilen bir string'in .charAt(0) "0" ile ilk karakteri alır ve char a çevirir.

        if (ch >= 'A' && ch <= 'Z') { // Burada yukarıda char'a çevrilmiş olan ilk değeri, büyük A ile büyük Z arasında
            System.out.println("Büyük harftir"); // olup olmadığını sorguluyoruz.

        } else {
            if (ch >= 'a' && ch <= 'z') { // Burada yukarıda char'a çevrilmiş olan ilk değeri, küçük ile küçük z arasında
                System.out.println("Kücük harftir"); // olup olmadığını sorguluyoruz.

            } else {
                System.out.println("Harf değildir."); // Burada hem büyük A-Z hem de küçük a-z arasında değil ise
                // harf değildir diyoruz.
            }

        }
        //// ÇÖZÜM İKİ ///

        if (Character.isUpperCase(ch)) {
            System.out.println("Büyük harftir.");

        } else if (Character.isLowerCase(ch)) {
            System.out.println("Kücük harftir.");

        } else {
            System.out.println("Harf değildir.");
        }

        /* Character Metotları */
        if (Character.isAlphabetic(ch)); // Ch karakteri alfabetik mi değil mi diye boolean olarak sorar.
        if (!Character.isAlphabetic(ch)); // Ch karakteri alfabetik değil mi diye boolean olarak sorar.
        if (Character.isDigit(ch)); // Ch karakteri rakamsal değer mi diye boolean olarak sorar.
        if (Character.isUpperCase(ch)); // Ch karakteri büyük harftir mi diye boolean olarak sorar.
        if (Character.isLowerCase(ch)); // Ch karakteri kücük harftir mi diye boolean olarak sorar.
        if (Character.isLetter(ch));




        // compare ile çözelim
        // Character.compare(ch,'a') = ch - 'a'
        if (Character.compare(ch,'a') >=0 && Character.compare(ch,'z')<=0) {
            System.out.println("kucuk harftir");
        } else {
            if (Character.compare(ch,'A') >=0 && Character.compare(ch,'Z')<=0) {
                System.out.println("Büyük harftir");
            } else {
                System.out.println("harf değildir");
            }
        }




    }

}