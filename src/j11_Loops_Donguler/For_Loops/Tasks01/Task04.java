package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
// task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi1=input.nextInt();
        System.out.print("Bir sayı daha giriniz : ");
        int sayi2=input.nextInt();

        if (sayi1<sayi2) {
            for (int i = sayi1; i<= sayi2; i++) {

                if (i % 2 == 0) {
                    System.out.println("Çift sayılar ==> " + i);
                }

            }
        }else {
            for (int i = sayi2; i<= sayi1; i++) {

                if (i % 2 == 0) {
                    System.out.println("Çift sayılar ==> " + i);
                }

            }
        }

        // ÇÖZÜM 2

        for (int i = Math.min(sayi1,sayi2); i < Math.max(sayi1,sayi2); i++) {
            if (i % 2 == 0) {
                System.out.println("Çift sayılar ==> " + i);
            }
        }








    }
}
