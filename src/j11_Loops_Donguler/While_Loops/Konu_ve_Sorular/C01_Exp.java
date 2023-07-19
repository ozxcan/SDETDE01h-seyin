package j11_Loops_Donguler.While_Loops.Konu_ve_Sorular;

import java.util.Scanner;

public class C01_Exp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Task 01 ) 1 den 10 a kadar çift sayıları yazdır

        // for ile çözelim

        for (int i = 1; i<= 10; i++) {
            if ( i % 2 == 0 ) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("-----------------------");

        // while ile çözelim

        int index = 1;
        while (index <= 10) {
            if (index % 2 == 0) {
                System.out.print(index+ " ");

            }
            index++;
        }
        System.out.println();
        System.out.println("-----------------------");

        // Do while ile çözelim

        int a = 1;
        do {
            a++;
            if (a % 2 == 0) {
                System.out.print(a+ " ");
            }

        }while (a <= 10);








    }

}
