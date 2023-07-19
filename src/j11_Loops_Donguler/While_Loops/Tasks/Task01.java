package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve
        // toplamını print eden code create edinz
        // 70+50+200+15
        // 1 , 2, 4, 9, 10 yapalım

        Scanner scan = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (sum <= 333) {
            System.out.print("Bir sayı giriniz: ");
            int number = scan.nextInt();
            counter++;
            sum +=number;

        }
        System.out.println("Sayıların toplamı ==> " + sum);
        System.out.println("Sayıların adedi ==> " + counter);
























    }


}
