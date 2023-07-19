package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        //Kodu aşağıya  yazınız.

        Scanner scan = new Scanner (System.in);
        System.out.print("En sevdiğiniz meyve nedir: ");
        String meyve = scan.nextLine();
        System.out.println("En sevdiginiz meyve " +meyve);


    }
}
