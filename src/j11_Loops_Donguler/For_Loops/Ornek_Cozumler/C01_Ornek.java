package j11_Loops_Donguler.For_Loops.Ornek_Cozumler;

import java.util.Scanner;

public class C01_Ornek {
    public static void main(String[] args) {
        /*
        TASK1
        Bir for çevrimi içerisinde ekrana n kez sıra ile bir true, bir false yazdırın.
        n = 1 == true
        n = 2 == true, false
        n = 3 == true, false, true
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir n değeri giriniz: ");
        int n = scan.nextInt();
        boolean bb = true;
        for (int i = 0; i < n; i++) {
            if (bb) {
                System.out.print(bb + "  ");
                bb = false;

            } else {
                System.out.print(bb + "  ");

                bb = true;
            }

        }
        System.out.println();
        System.out.println("****************");

        // CÖZÜM 2

        boolean flag = true;
        for (int i = 0; i < n; i++) {

            System.out.print(flag + "  ");
            flag = !flag;


        }
    }
}
