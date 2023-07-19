package j11_Loops_Donguler.For_Loops.Tasks02;

import java.util.Scanner;

public class Task02_11 {
    public static void main(String[] args) {
        // 1) 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        for (int i = 0; i < 256; i++) {
            char c = (char) i;
            System.out.println("Sayı değeri ==> " +i + "  Karakter değeri ==> " + c);
        }






        // 2) 100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe)

        int sum = 0;
        int i;

        for ( i= 100; i>13; i--) {

            if ( i % 13 == 0) {
                System.out.print(i + " > ");
                sum +=i;
            }


        }
        System.out.println(i);
        System.out.println();
        System.out.println("Sayıların toplamı " + sum);




        // 3) Girilen bir stringdeki a harfi sayısını bulunuz.Ama  c harfine  gelirse döngüden çıkılsın

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scan.nextLine();

        int aHarfiToplam = 0;
        for (int x = 0; x < str.length(); x++) {

            if (str.charAt(x) == 'c') {
                break;
            }

            if (str.charAt(x) == 'a') {
                aHarfiToplam++;
                System.out.println("a değeri ===> " + x +"'inci indekstedir.");


            }


        }
        System.out.println();
        System.out.println(aHarfiToplam+ " adet \"a\" harfi vardır.");













    }







}
