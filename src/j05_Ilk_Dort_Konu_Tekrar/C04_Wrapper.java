package j05_Ilk_Dort_Konu_Tekrar;

import java.util.Scanner;

public class C04_Wrapper {
    public static void main(String[] args) {

        //Task6

        // Klavyeden girilen biri int, diğeri double, iki sayıdan büyük olanını Wapper
        // class kullanarak ekrana yazdırınız

        Scanner sa = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int aa = sa.nextInt();

        System.out.print("Bir sayı giriniz: ");
        double bbb = sa.nextDouble();

        double cc = aa;
        System.out.println("Sonuc: " + Double.max(bbb,cc));




    }
}
