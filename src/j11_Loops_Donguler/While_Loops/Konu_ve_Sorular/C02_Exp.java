package j11_Loops_Donguler.While_Loops.Konu_ve_Sorular;

import java.util.Scanner;

public class C02_Exp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         Task ----->>
          1 den n a kadar çift sayıları yazdır
         */

        // for ile çözelim
        System.out.print("Bir n sayısı gir: ");
        int n = scan.nextInt();

        for (int i = 1; i < n; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println("-------------");


        // while ile çözelim

        int i = 1;
        while (i < n) {

            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("-------------");

        //Do while ile çözelim

        i = 1;
        do {
            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
            i++;
        }while (i < n);







    }

}
