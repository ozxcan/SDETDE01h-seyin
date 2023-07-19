package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

import java.util.Scanner;

public class C02_For_Example {
    public static void main(String[] args) {

        /*  -----> ÖRNEK
        1 ' den n e kadar (n dahil) rakamları yan yana yazdırın.
         input : 3 mesela
         output : 1, 2, 3  şeklinde olacak. */


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();

        for (int i = 1; i < n; i++) {

            System.out.print(i + ", ");


        }
        System.out.println(n);
        System.out.println("**************");


        /*  -----> ÖRNEK
        1 ' den n e kadar (n dahil) sayıların toplamını bulunuz.
         */

        int toplam=0; // Toplamı ilk başlangıç değeri olarak sıfıra eşitledik. Çünkü for içindeki toplam değişkenini kullanabilmesi için.
        for (int i = 1; i <= n; i++) {
            toplam = toplam + i; // yada toplam +=i de yazabiliriz.

        }
        System.out.println("Toplam: " + toplam); // Toplamı for çevirimi bittikten sonra, for body si dışınd yazmamız lazım.
        System.out.println("**************");










    }
}
