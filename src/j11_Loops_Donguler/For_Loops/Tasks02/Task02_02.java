package j11_Loops_Donguler.For_Loops.Tasks02;

import java.util.Scanner;

public class Task02_02 {
    public static void main(String[] args) {
        // verilen n adet sayıdan en küçüğünü bulan code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı girilecek ise belirtiniz: ");
        int sayac = scan.nextInt();


        int eK = Integer.MAX_VALUE; // Burda en küçük değeri Integer.MAX_VALUE ile integer in en büyük değeri olarak kabul ettim
                                    // Bu şekilde diğer verilen değerleri kıyaslama imkanı elde etmiş olurum.

        for (int i =0; i<sayac; i++) {

            System.out.print("Sayı giriniz: ");
            int sayi = scan.nextInt();
            if (sayi < eK) {
                eK = sayi;
            }


        }System.out.println("En küçük sayı "+ eK);

    }
}
