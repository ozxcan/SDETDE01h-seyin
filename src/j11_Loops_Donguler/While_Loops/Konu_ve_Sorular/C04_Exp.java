package j11_Loops_Donguler.While_Loops.Konu_ve_Sorular;

import java.util.Scanner;

public class C04_Exp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // Task 04 ) Negatif bir değer girilene kadar kullanıcıdan alınan girişlerin toplamını yazdırın
        // for ile çözelim


        int sum = 0;
        for (int i=0; i<Integer.MAX_VALUE ; i++) {
            System.out.print("Bir değer giriniz: ");
            int num = scan.nextInt();
            if (num<0) {
                break;

            }
            sum += num;


        }
        System.out.println();
        System.out.println("Genel Toplam "+sum);
        System.out.println("------------ ");


        // While ile çözelim

        int num =0;
        sum = 0;
        while (num>=0) {
            sum += num;
            System.out.print("Bir değer giriniz : ");
             num = scan.nextInt();


        }System.out.println();
        System.out.println("Genel Toplam "+sum);
        System.out.println("------------ ");


        // do while ile çözelim


         sum = 0;
         num = 0;
        do {
            sum += num;
            System.out.print("Bir değer giriniz : ");
            num = scan.nextInt();



        } while (num >= 0);
        System.out.println();
        System.out.println("Genel Toplam " + sum);


    }


}
