package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz

        Scanner scan = new Scanner(System.in);

        // do while ile yapalım

        int eB = 0;
        int sayac = 0;

        do {

            System.out.print("Bir sayı giriniz: ");
            int number = scan.nextInt();
            if (number > eB) {
                eB = number;
            }
            sayac++;
        }while(sayac<5);
        System.out.println();
        System.out.println("En büyük sayı "+eB);
        System.out.println("-----------------------");

        // while ile yapalım

        sayac = 0;
        while (sayac<5) {
            System.out.print("Bir sayı giriniz: ");
            int number = scan.nextInt();
            if (number > eB) {
                eB = number;
            }
            sayac++;
        }
        System.out.println();
        System.out.println("En büyük sayı "+eB);
        System.out.println("-----------------------");

        // for ile yapalım
        for (int i = 0; i < 5; i++) {
            System.out.print("Bir sayı giriniz: ");
            int number = scan.nextInt();
            if (number > eB) {
                eB = number;
            }

        }System.out.println();
        System.out.println("En büyük sayı "+eB);
        System.out.println("-----------------------");




    }
}
