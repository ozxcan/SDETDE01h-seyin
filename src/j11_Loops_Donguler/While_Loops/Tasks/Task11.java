package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
            /*
        task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını
        print eden code create edinz.
        input : 10,20,0
        output 30 ve 2
         */

        Scanner scan = new Scanner(System.in);

        int i = 0;
        int num = 1;
        int sum =0;
        while(num >0) {
            System.out.print("Sayı giriniz: ");
             num = scan.nextInt();
            if(num == 0) {

            }
            sum +=num;
            i++;
        }
        System.out.println();
        System.out.println(i + " adet sayı girilmiştir.");
        System.out.println("Sayıların toplamı ==> " + sum);
        System.out.println("-------------------------");

        // do while ile yapalım
        sum = 0;
        i = 0;
        do {
            System.out.print("Sayı giriniz: ");
            num = scan.nextInt();
            if(num == 0) {
                break;
            }
            sum +=num;
            i++;
        }while (i < num);
        System.out.println();
        System.out.println(i + " adet sayı girilmiştir.");
        System.out.println("Sayıların toplamı ==> " + sum);
        System.out.println("-------------------------");

        // for ile yapalım
        sum = 0;
        num = 1;
        for ( i =0; i <= num; i++) {
            System.out.print("Sayı giriniz: ");
            num = scan.nextInt();
            if(num == 0) {
                break;
            }
            sum +=num;

        }System.out.println();
        System.out.println(i + " adet sayı girilmiştir.");
        System.out.println("Sayıların toplamı ==> " + sum);
        System.out.println("-------------------------");



    }
}
