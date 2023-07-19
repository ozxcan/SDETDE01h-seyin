package j11_Loops_Donguler.While_Loops.Tasks02;

import java.util.Scanner;

public class Task02_04 {
    public static void main(String[] args) {
        // n1 den n2 kadar, tek ve çift sayıların toplamını bulan program yazınız

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir n değeri giriniz: ");
        int n = scan.nextInt();

        System.out.print("Bir n değeri giriniz: ");
        int n2 = scan.nextInt();

        int min = Math.min(n, n2);
        int max = Math.max(n, n2);
        int tekToplam =0;
        int ciftToplam =0;

        while (min < max) {
            if (min % 2 == 0) ciftToplam += min;
            else tekToplam += min;
            min++;
        }
        System.out.println("Tek sayıların toplamı " + tekToplam);
        System.out.println("Çift sayıların toplamı " + ciftToplam);


    }
}