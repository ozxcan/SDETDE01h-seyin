package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /* Task->
           girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("agam yıl giresen : ");
        int aYil = input.nextInt();
        System.out.println("   ***  if blok   ***   ");

        if (aYil % 4 == 0) {
            if (aYil % 100 != 0) {
                System.out.println("Artık yıldır.");

            }else {
                if (aYil % 400 == 0) {
                    System.out.println("Artık yıldır.");

                }else {
                    System.out.println("Artık yıl değildir.");
                }
            }

        }else {
            System.out.println("Artık yıl değildir.");

        }

        String kalan = (aYil % 4 ==0) ? (aYil % 100 != 0) ? "Artık yıldır" : (aYil % 400 == 0) ? "Artık yıldır": "Artık yıl değildir" : "Artık yıl değildir.";
        System.out.println(kalan);

    }
}


