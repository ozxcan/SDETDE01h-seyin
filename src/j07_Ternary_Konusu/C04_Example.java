package j07_Ternary_Konusu;

import java.util.Scanner;

public class C04_Example {
    public static void main(String[] args) {

        // -99 ile +99 arasında girilen bir tam sayının 1 veya 2 basamaklı olmasını kontrol eden bir kod yazınız..

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        String basamak = ((num >= 10 && num < 100) || (num > -100 && num <= -10)) ? "İki basamak": "Tek Basamak";
        System.out.println("Sayı "+ basamak + " 'lıdır");
        System.out.println();

        // 2 Basamaktan büyük olma durumunu da kontrol edin

        String basamak2 = ((num >= 10 && num < 100) || (num > -100 && num <= -10)) ? "İki basamak": ((num < 10 && num > -10)) ? "Tek basamak" : "Çok basamak";
        System.out.println("Sayı "+ basamak2 + " 'lıdır");



    }
}
