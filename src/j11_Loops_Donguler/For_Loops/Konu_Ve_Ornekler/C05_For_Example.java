package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

import java.util.Scanner;

public class C05_For_Example {
    public static void main(String[] args) {
        /*  -----> ÖRNEK
        Rastgele üretilen (1 ile 100 arasında) 10 adet integer sayıdan; çift olanların toplamını bulunuz.

         */


        int toplam = 0;

        for (int i = 0; i < 10; i++) {

            int sayi = (int) (Math.random()*100+1); // 1 ile 100 arasında random sayı üretiyoruz.
            // 0 ila 100 arasında denseydi, Math.random()*101 yazardık.
            System.out.print(sayi + " ");
            if (sayi % 2 == 0) {
                toplam = toplam + sayi;
            }


        }
        System.out.println();
        System.out.println("Toplam " + toplam );


    }
}
