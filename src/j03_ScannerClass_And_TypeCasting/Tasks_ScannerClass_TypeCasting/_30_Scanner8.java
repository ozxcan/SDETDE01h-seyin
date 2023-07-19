package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Kilonuz nedir: ");
        byte kilo = scan.nextByte();

        System.out.println("Kilonuz " + kilo);






    }
}
