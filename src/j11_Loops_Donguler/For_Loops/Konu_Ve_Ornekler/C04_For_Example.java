package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

import java.util.Scanner;

public class C04_For_Example {
    public static void main(String[] args) {
        /*  -----> ÖRNEK
        n adet rastgele 0 ile 10 arasında sayı üretip Toplamını bulunuz.

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı toplanacak: ");

        int n = scan.nextInt();
        int toplam = 0;
        for (int i = 0; i < n; i++) {

            int sayi = (int) (Math.random()*11); // 0 ile 10 arasında random sayı üretiyoruz.
            // 1 ila 10 arasında denseydi, Math.random()*10+1 yazardık.

            toplam = toplam + sayi;



        }
        System.out.println("Toplam " + toplam );


    }


}

