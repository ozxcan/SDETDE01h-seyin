package j13_Method_Creation.Sorular;

import java.util.Scanner;

public class S15 {
    public static void main(String[] args) {

        /*
        Task 01 deki metodu kullanarak N adet rastgele sayıdan en büyüğünü
        bulan code yazınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayı üretilsin: ");
        int n = scan.nextInt();

        int eB=Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            int sayi = (int) (Math.random()*100+1);
            System.out.print(sayi+ " ");

            eB = S14.buyukBul(eB, sayi);

        }
        System.out.println();
        System.out.println("En büyük sayı " +eB);



    }


}
