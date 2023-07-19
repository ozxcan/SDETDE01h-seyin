package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Kaça kadar sayı: ");
        int sayi = oku.nextInt();

        int i =1;
        while (i < sayi) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;

        }
        System.out.println();
        System.out.println("----------------");

        // do while ile yapalım
        i = 1;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }while (i < sayi);





    }
}
