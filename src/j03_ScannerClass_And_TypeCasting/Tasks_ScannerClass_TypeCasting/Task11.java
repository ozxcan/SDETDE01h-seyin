package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir karakter girin: ");
        char ch = scanner.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("Girilen Karakter: " + ch);
        System.out.println("ASCII Değeri: " + ascii);


    }


}
