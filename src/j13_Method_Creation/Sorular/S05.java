package j13_Method_Creation.Sorular;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Soru 3) Kullanicidan bir tam sayi alin.
                 Bu sayinin negatif veya pozitif oldugunu,
                 tek mi cift mi oldugunu ve
                 uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
                 100'den kucukse sadece birler basamagini yazdirin.

         */

        System.out.print("Bir tam sayı: ");
        int num = scan.nextInt();

        String ciftMi = number(num);
        System.out.println(ciftMi);
        System.out.println("********");
        String pozitifMi = pozitifMi(num);
        System.out.println(pozitifMi);
        System.out.println("********");
        int toplam = basamak(num);
        System.out.println(toplam);
        System.out.println("********");



    }
    public static String number (int a) {
        String str;
        if ( a % 2 == 0) {
            str = "Sayı çiftir.";

        }else str ="Sayı tektir.";

        return str;
    }
    public static String pozitifMi (int b) {
        String str2;
        if ( b >0) str2 = "Sayı pozitiftir.";
        else str2 = "Sayı negatiftir.";
        return str2;
    }
    public static int basamak (int c) {
        int onlarB =0;
        int yuzlerB=0;
        int birlerB=0;
        if (c >=100) {
            birlerB = c % 10;
            onlarB = (c%100)/10;
            yuzlerB = c/100;
        } else {
            birlerB = c % 10;
        }
        return (onlarB+birlerB+yuzlerB);
    }
}
