package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int num = scan.nextInt();

        if (num > 0) {
            if (num > 10) {
                System.out.println("Büyüksün!");

            }else {
                System.out.println("Normalsin!");
            }

        }else {
            if (num > -10) {
                System.out.println("Negatifsin!");

            }else {
                System.out.println("Çok Negatifsin!");
            }
        }

        String number = (num > 0) ? ((num > 10) ? "Büyüksün" : "Normalsin") : ((num > -10) ? "Negatifsin!" : "Çok negatifsin!");
        System.out.println(number);


    }
}
