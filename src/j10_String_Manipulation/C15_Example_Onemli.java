package j10_String_Manipulation;

import java.util.Scanner;

public class C15_Example_Onemli {
    public static void main(String[] args) {

        /* TASK 03
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * kelime = Ali
         * output = lilili
         *
         * kelime = el
         * output = el

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = sc.nextLine();

        if (kelime.length() >=3) {
            System.out.println(kelime.substring(kelime.length()-2)+kelime.substring(kelime.length()-2)+kelime.substring(kelime.length()-2));
        }else {
            System.out.println(kelime);
        }


    }
}
