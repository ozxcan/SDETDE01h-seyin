package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

import java.util.Scanner;

public class C13_For_CarpimTablosu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* =====> TASK
        for döngüsü kullanarak bir çarpım tablosu yapınız.
        (5 e ait çarpım tablosunu yapalım)
         */

        System.out.print("Carpım tablosunun ilk degeri: ");
        int n = scan.nextInt();
        System.out.print("Carpım tablosunun ikinci degeri: ");
        int m = scan.nextInt();

        for ( n =1; n <= 10; n++) {
            System.out.println(n+ "  değeri için ===> "+ n + "*" + m+ " = " + (n*m));
        }




    }


}
