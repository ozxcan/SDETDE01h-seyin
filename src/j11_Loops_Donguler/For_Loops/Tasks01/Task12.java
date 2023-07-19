package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> n'e kadar olan sayılardan girilen 5 sayının, 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */

        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        for (int i =0; i<5; i++) {

            System.out.print("Bir sayı giriniz: ");
            int a = scan.nextInt();
            if (a >=10 && a<= 20) {
                toplam = toplam ;
            }else {
                toplam +=a;
            }



        }
        System.out.println("Genel toplam ===> " + toplam);






    }
}
