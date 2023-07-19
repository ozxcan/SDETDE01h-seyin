package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    Bir String oluştur.
          Konsol'a 10 sene önceki yaşadığın şehri yazın.
          Bu String'i yazdırın.   */

        //Kodu aşağıya  yazınız.

        Scanner scan = new Scanner (System.in);
        System.out.print("On sene önce nerede yasiyordun? ");
        String input = scan.nextLine();
        System.out.println("On sene önce yaşadığınız şehir " +input);





    }
}
