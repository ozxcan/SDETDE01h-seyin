package j07_Ternary_Konusu;

import java.util.Scanner;

public class C11_Example {
    public static void main(String[] args) {

        /*TASK :

        Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
        degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
        degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.
                */


        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi = input.nextInt();

        String basamak = (sayi >=1000 && sayi <=9999) ? "4 Basamaklı" : (sayi % 2 == 0) ? "4 basamaklı olmayan çift sayı" : "4 basamaklı olmayan tek sayı";
        System.out.println(basamak);
        System.out.println();

        // Burda sayi int değerini string'e çevirerek yaptık
        String basamak2 = (String.valueOf(sayi).length() == 4)? "4 Basamaklı" : (sayi % 2 == 0)? "4 basamaklı olmayan çift sayı" : "4 basamaklı olmayan tek sayı";
        System.out.println(basamak2);
        System.out.println( );

        // Burda sayi int değerini string'e başka yöntem ile çevirerek yaptık
        String basamak3 = (Integer.toString(sayi).length() == 4)? "4 Basamaklı" : (sayi % 2 == 0)? "4 basamaklı olmayan çift sayı" : "4 basamaklı olmayan tek sayı";
        System.out.println(basamak3);
        System.out.println( );







    }
}
