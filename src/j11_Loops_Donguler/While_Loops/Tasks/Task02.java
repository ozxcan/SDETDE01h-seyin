package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while loop
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        int startNumber = scan.nextInt();
        System.out.print("İkinci sayı: ");
        int endNumber = scan.nextInt();

        int index = startNumber;

        while (index >= startNumber && index < endNumber) {
            System.out.print(index + " ");
            index++;

        }
        System.out.println();
        System.out.println("--------------------");

        // for ile

        for (int i = startNumber; i < endNumber; i++) {
            System.out.print(i + " ");
        }



    }
}
