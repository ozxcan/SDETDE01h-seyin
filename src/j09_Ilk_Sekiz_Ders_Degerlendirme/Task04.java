package j09_Ilk_Sekiz_Ders_Degerlendirme;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // Klavyeden girilen 4 sayının en büyüğünü
        //
        // Task 04.1 : if kullanarak bulunuz (ternary, wrapper,Math kullanılmayacak)
        // Task 04.2 : ternary kullanarak bulunuz (if, wrapper,Math kullanılmayacak)
        // Task 04.3 : Matt class kullanarak bulunuz (if, ternary, wrapper,kullanılmayacak)
        // Task 04.4 : Wrapper class kullanarak bulunuz (if, ternary, math,kullanılmayacak)
        // Task 04.5 : Math class içinde ternary kullanarak bulunuz (if,wrapper,kullanılmayacak)
        // Task 04.6 : Ternary içinde Math class kullanarak bulunuz (if,wrapper,kullanılmayacak)

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int s1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int s2 = scan.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int s3 = scan.nextInt();
        System.out.print("Döndüncü sayıyı giriniz: ");
        int s4 = scan.nextInt();


        // Task 04.1
        int eB = s1;

        if (s2 > eB) {
            eB = s2;
        }
        if (s3 > eB) {
            eB = s3;
        }
        if (s4 > eB) {
            eB = s4;
        }

        System.out.println("En büyük sayı " + eB);
        System.out.println("**********");

        // Task 04.2

        String result = (s1 > s2 && s1 > s3 && s1 > s4) ? "En büyük sayı " + s1 : (s2 > s1 && s2 > s3 && s2 > s4) ? "En büyük sayı " + s2 : (s3 > s1 && s3 > s2 && s3 > s4 ) ? "En büyük sayı " + s3 : "En büyük sayı " + s4;
        System.out.println(result);
        System.out.println("********");



        // Task 04.3

        System.out.println("En büyük sayı " + (Math.max(s1, Math.max(s2, Math.max(s3, s4)))));
        System.out.println("En büyük sayı " + (Math.max(Math.max(s1, s2), Math.max(s3, s4))));
        System.out.println("*******");

        // Task 04.4

        int max = Integer.max(s1, Integer.max(s2, Integer.max(s3, s4)));
        int mmax = Integer.max(Integer.max(s1, s2), Integer.max(s3, s4));
        System.out.println("En büyük sayı " + mmax);
        System.out.println("En büyük sayı " + max);
        System.out.println("*******");

        // Task 04.5
        int mAx = Math.max(s1 > s2 ? s1:s2, s3 > s4 ? s3:s4);
        System.out.println("En büyük sayı " + mAx);
        System.out.println("******");


        // Task 04.6
        int maax = (s1 > s2) ? (Math.max(s1,(Math.max(s3,s4)))): (Math.max(s2,(Math.max(s3,s4))));
        System.out.println("En büyük sayı " + maax);
        System.out.println("********");









    }
}
