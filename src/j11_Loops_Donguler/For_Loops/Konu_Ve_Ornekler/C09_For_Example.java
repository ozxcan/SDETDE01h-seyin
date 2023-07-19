package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

import java.util.Scanner;

public class C09_For_Example {
    public static void main(String[] args) {

        /*  -----> ÖRNEK
        Verilen String 'i her satıra bir harf gelecek şekilde yazdırınız.

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scan.nextLine();



        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
        System.out.println("*******");
        System.out.println();



        /*  -----> ÖRNEK
        Verilen String 'i her satıra bir harf gelecek şekilde tersten yazdırınız.

         */

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt((str.length()-1)-i)+ " ");
        }


                        // 2.yöntem
        System.out.println();
        for (int i = 0; i <str.length() ; i++) {
            // System.out.println("i="+i+"   "+(str.length()-1-i) );
            System.out.println(str.charAt(str.length()-1-i));
        }





    }
}
