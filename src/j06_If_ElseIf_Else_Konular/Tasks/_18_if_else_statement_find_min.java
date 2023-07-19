package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i1 = scan.nextInt();
        System.out.print("Enter a number too: ");
        int i2 = scan.nextInt();
        System.out.print("Enter a number again: ");
        int i3 = scan.nextInt();

        if (i1 < i2 && i1 < i3) {
            System.out.println("En kücük sayı " + i1);
        }
        if (i2 < i1 && i2 < i3) {
            System.out.println("En kücük sayı " + i2);
        }
        if (i3 < i1 && i3 < i2) {
            System.out.println("En kücük sayı " + i3);
        }

    }
}
