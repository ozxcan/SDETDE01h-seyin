package j07_Ternary_Konusu;

import java.util.Scanner;

public class H02_Ternary {
    // Task -> -99 ie +99 arasında girilen bir tamsayının
    // 1 veya 2 basamaklı olmasını kontrol eden code create ediniz.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int sayi = scanner.nextInt();
        String sonuc = (sayi>-10 && sayi<10) ? "Tek basamaklıdır" : "2 basamaklıdır";
        System.out.println("sonuc = " + sonuc);

        // 2 basamktan buyuk olma durumunu da kontrol ediniz
        sonuc = (sayi>-10 && sayi<10) ? "Tek basamaklıdır" :
                ( (sayi>-100 && sayi<100) ? "2 basamaklıdır":"2 den çok basamaklıdır");
        System.out.println("basmaklı sonuc = " + sonuc);

        // ör
        Object sonuc2 = (sayi>-10 && sayi<10) ? "Tek basamaklıdır" : 2;

        //ör
        System.out.println((sayi>-10 && sayi<10) ? "Tek basamaklıdır" : 2 );



    }
}
