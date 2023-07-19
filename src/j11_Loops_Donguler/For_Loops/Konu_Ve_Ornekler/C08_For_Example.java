package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

import java.util.Scanner;

public class C08_For_Example {
    public static void main(String[] args) {
        /*  -----> ÖRNEK
        Verilen String 'i her satıra bir harf gelecek şekilde yazdırınız.

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }


        // 2. yöntem
        System.out.println();
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.substring(i,i+1));
        }



    }


}
