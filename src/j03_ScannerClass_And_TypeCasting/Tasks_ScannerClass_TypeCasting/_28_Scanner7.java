package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir banka hesabınız var mı ? (True/False) : ");
        boolean bankaHesabi = scan.nextBoolean();
        System.out.println(bankaHesabi);







    }
}
