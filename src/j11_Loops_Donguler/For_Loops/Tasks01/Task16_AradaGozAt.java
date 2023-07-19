package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task16_AradaGozAt {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
      */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("agam bir sayi giresen : ");

        int sayi = input.nextInt();


        int sayac = 0; // Burda sayac, verilen sayının bölenlerinin adedini bulmak için kullandım.
        for (int i = 2; i < sayi; i++) {// i ' yi iki den başlattık. çünkü her sayı 1 e bölüneceği için sayı asal değil çıkar.
            if (sayi % i == 0) {
                sayac++;
            }

        }if ( sayac != 0) System.out.println("Asal sayı değildir."); // Eğer sayaç 0 dan fazla ise asal değildir.
        else System.out.println("Asal sayıdır.");


        //// 3 ' den 100'e kadar olan asal sayıları print et

        int sayac1 =0;
        for (int i = 3; i < 100; i++) {

            for (int j = 2; j < i; j++) {

               if ( i % j == 0) {
                   sayac1++;
               }

            }
            if (sayac1 == 0) System.out.println(i + " sayısı Asal sayıdır.");
            sayac1 = 0;



        }
    }
}