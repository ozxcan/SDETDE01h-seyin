package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

import java.util.Scanner;

public class C14_For_FaktoriyelBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* =====> TASK
        for döngüsü kullanarak bir sayının faktoriyel değerini bulalım.

         */

        System.out.print("Faktoryeli alınacak sayı: ");
        int n = scan.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;


        }
        System.out.println(fact);



    }
}
