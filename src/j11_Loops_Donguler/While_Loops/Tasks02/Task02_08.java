package j11_Loops_Donguler.While_Loops.Tasks02;

import java.util.Scanner;

public class Task02_08 {

    public static void main(String[] args) {
        // 1  ila 100 arasında rastgele n adet sayı üretiniz, bu sayıların %kaçı tek sayıdır
        //yazdırınız
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı üretilsin: ");
        int n = scan.nextInt();

        int i = 0;
        double oran;
        int tekSayi =0;
        while (i < n) {

            int number = (int) (Math.random() * 100+1);
            if (number % 2 != 0) {
                tekSayi++;
            }
            i++;
        }
        oran = (double) tekSayi/n*100;
        System.out.println("Tek sayıların oranı =>" + oran);




    }
}
