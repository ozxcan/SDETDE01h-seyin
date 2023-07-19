package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

import java.util.Scanner;

public class C11_Debugging_Exp {
    public static void main(String[] args) {

        /*
         TASK_01 : 1 den n kadar sayıların toplamını bulunuz ( n dahil)
         Debugging deneyelim
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir n değeri giriniz: ");
        int sayac = scan.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayac; i++) {
            toplam += i;
            System.out.println("i değeri == " + i);


        }
        System.out.println("Genel Toplam " + toplam);





    }
}
