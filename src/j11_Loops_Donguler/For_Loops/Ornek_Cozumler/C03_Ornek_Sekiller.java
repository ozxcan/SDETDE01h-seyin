package j11_Loops_Donguler.For_Loops.Ornek_Cozumler;

import java.util.Scanner;

public class C03_Ornek_Sekiller {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i =1; i < 6; i++) {
            for ( int j = 1; j < 6; j++) {
                //System.out.print(i*j+ " ");  burda tam düzenli olmamış şekilde  yazdırır.
                System.out.printf("%3d",(i*j)); // soutf ile %3d yazınca baştan ve sayılar arasında 2 indeks boşluk bırakarak yazar
                                                // ve düzgün şekil çıkar.

            }
            System.out.println();
        }


        /*
        Verilen n sayısına göre aşağıdaki şekli oluşturun.
        *
        * *
        * * *
        * * * *
        * * * * *

         */

        System.out.print("Bir n sayısı giriniz: ");
        int sayac = scan.nextInt();

        for (int i = 0; i < sayac; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*"+ "  ");
            }
            System.out.println();

        }

        /*
        Aşağıdaki şekli yazdırın.
        1
        2   3
        4   5  6
        7   8  9 10
        11 12 13 14 15
         */

        int a = 7;
        int rakam = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  "+ rakam++);
            }
            System.out.println();

        }









    }
}
