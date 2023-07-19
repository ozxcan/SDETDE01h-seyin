package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class _23_Scanner2 {

    public static void main(String[] args) {

    /*    Bir int oluşturun.
          Konsol'a herhangi bir sayı giriniz.
          Bu sayıyı yazdırın.   */

        //Kodu aşağıya  yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();
        System.out.println("Sayı " +sayi);



    }
}
