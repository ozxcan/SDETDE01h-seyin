package j07_Ternary_Konusu.Tasks;

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

        String s = (ch >= 'A' && ch <= 'Z') ? "Büyük Harftir" : ((ch >= 'a' && ch <= 'z') ? "Küçük Harftir" : "Harf Değildir");
        System.out.println(s);






    }

}