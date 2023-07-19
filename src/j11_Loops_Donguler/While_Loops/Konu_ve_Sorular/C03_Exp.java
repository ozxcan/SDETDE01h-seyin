package j11_Loops_Donguler.While_Loops.Konu_ve_Sorular;

import java.util.Scanner;

public class C03_Exp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Task 02 ) 1 den n e kadar olan çift sayıların toplamını yazdırınız

        // for ile çözelim
        System.out.print("Bir n sayısı gir: ");
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");
                sum = sum+i;
            }

        }
        System.out.println();
        System.out.println("Çift sayıların toplamı ===> " + sum);

        System.out.println("-------------");


        // while ile çözelim

        int i = 1;
        sum = 0;
        while (i < n) {

            if (i % 2 == 0) {

                System.out.print(i + " ");
                sum = sum+i;
            }
            i++;
        }
        System.out.println();
        System.out.println("Çift sayıların toplamı ===> " + sum);

        System.out.println("-------------");

        //Do while ile çözelim

        i = 1;
        sum = 0;
        do {
            if (i % 2 == 0) {

                System.out.print(i + " ");
                sum = sum+i;
            }
            i++;
        }while (i < n);
        System.out.println();
        System.out.println("Çift sayıların toplamı ===> " + sum);


















    }

}
