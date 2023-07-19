package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */


        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i1 = scan.nextInt();
        System.out.print("Enter a number too: ");
        int i2 = scan.nextInt();
        System.out.print("Enter a number again: ");
        int i3 = scan.nextInt();

        if (i1 > i2 && i1 > i3) {
            System.out.println("En büyük sayı " + i1);
        }
        if (i2 > i1 && i2 > i3) {
            System.out.println("En büyük sayı " + i2);
        }
        if (i3 > i1 && i3 > i2) {
            System.out.println("En büyük sayı " + i3);
        }


    }
}
