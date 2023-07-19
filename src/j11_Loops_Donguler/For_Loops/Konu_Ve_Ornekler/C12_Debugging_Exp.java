package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

import java.util.Scanner;

public class C12_Debugging_Exp {
    public static void main(String[] args) {

        /*  TASK_02 : Kullanicidan 100’den kucuk bir tamsayi isteyin.
             1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.
            Debugging Deneyelim
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("100'den küçük bir sayaç değeri giriniz: ");
        int sayac = scan.nextInt();

        for (int i = 1; i <= sayac; i++) {
            if (i % 3 == 0) {
                System.out.println("3'ün katı olan değer ===> " + i);
            }

        }



    }
}
