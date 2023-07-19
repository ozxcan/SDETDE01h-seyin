package j11_Loops_Donguler.While_Loops.Tasks02;

import java.util.Scanner;

public class Task02_06 {
    public static void main(String[] args) {

        // ekrandan 10 adet sayı giriniz ve bunların tek sayı olanların toplamını bulunuz

        Scanner scan = new Scanner(System.in);
        int i = 0;
        int sum = 0;

        while (i < 10) {
            System.out.print("Bir n değeri giriniz: ");
            int n = scan.nextInt();
            if (n % 2 != 0) {
                sum += n;
            }

            i++;
        }
        System.out.println("Sayıların toplamı " + sum);







    }
}
