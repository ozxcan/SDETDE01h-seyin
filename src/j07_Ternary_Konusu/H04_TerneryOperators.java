package j07_Ternary_Konusu;

import java.util.Scanner;

public class H04_TerneryOperators {
    public static void main(String[] args) {
        /*
        TASK :
        Girilen bir pozitif tamsayı  4 basamaklı ise  “4 Basamaklı” yazdırın
        degilse çift olup olmadigini kontrol edip. Çift ise “4 basamaklı olmayan çift sayı”
        degilse “4 basamaklı olmayan tek sayı"  print eden code create ediniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi = input.nextInt();
        // if (sayı>=1000 ve sayı < 10 000) yaz "4 basamaklı" VEYA (sayi+"").length ==4 )
        // else if (çift) yaz "4 basamaklı olmayan çift sayı"
        //      else yaz "4 basamaklı olmayan tek sayı"
        String sonuc = Integer.toString(sayi).length() == 4 ? "4 basamakli"
                : sayi % 2 == 0 ? "4 basamakli olmayan cift sayi"
                                : "4 basamaklı olmayan tek sayı";
        System.out.println(sonuc);


    }
}
