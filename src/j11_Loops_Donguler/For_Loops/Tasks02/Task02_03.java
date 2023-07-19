package j11_Loops_Donguler.For_Loops.Tasks02;

import java.util.Scanner;

public class Task02_03 {
    public static void main(String[] args) {
        // 1 den n'e kadar çift sayıların toplamını bulan bir program yazınız

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaça kadar sayı girilecek ise belirtiniz: ");
        int n = scan.nextInt();

        int sum = 0;
        for (int i =0; i < n; i=i+2) {

            System.out.println("i değeri: ==>" +i);
            sum = sum +i;

        }
        System.out.println();
        System.out.println( n +"'e kadar olan çift sayıların toplamı = " + sum);

    }
}
