package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı toplamak istersiniz? : ");
        int sayiAdedi= scan.nextInt();

        int i=0;
        int sum=0;

        while (i<sayiAdedi) {
            System.out.print("Sayı giriniz: ");
            int sayi = scan.nextInt();
            sum+=sayi;
            i++;
        }
        System.out.println();
        System.out.println("Sayıların toplamı " + sum);
        System.out.println("------------------");

        // do while ile yapalım

        sum =0;
        i =0;
        do {
            System.out.print("Sayı giriniz: ");
            int sayi = scan.nextInt();
            sum+=sayi;
            i++;
        }while(i<sayiAdedi);
        System.out.println();
        System.out.println("Sayıların toplamı " + sum);
        System.out.println("------------------");

    }

}
