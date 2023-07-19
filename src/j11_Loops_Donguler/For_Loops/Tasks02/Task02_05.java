package j11_Loops_Donguler.For_Loops.Tasks02;

import java.util.Scanner;

public class Task02_05 {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen n adet sayının  çift olanlarını ekrana yazınız

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı üretilsin: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            int sayi = (int) (Math.random()*10+1);

            if ( sayi % 2== 0) {
                System.out.print(sayi + " ");

            }

        }

    }
}
