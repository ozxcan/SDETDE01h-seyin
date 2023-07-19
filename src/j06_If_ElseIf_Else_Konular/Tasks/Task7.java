package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
         /*  Altta int number klavyeden girilerek oluşturulmuştur.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/


        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is a EVEN number. ");

        }else {
            System.out.println("Number is a ODD number");
            System.out.println();

        }
        System.out.println("******* Çözüm 2 ********");
        System.out.println();
        //// Çözüm 2
        if (number % 2 == 1) {
            System.out.println("Number is a ODD number. ");

        }else {
            System.out.println("Number is a EVEN number");
            System.out.println();


        }
        System.out.println("******* Çözüm 3 ********");
        System.out.println();

        /// Çözüm 3

        if (number % 2 != 0) {
            System.out.println("Number is a ODD number. ");

        }else {
            System.out.println("Number is a EVEN number");
            System.out.println();

        }
        System.out.println("******* Çözüm 4 ********");
        System.out.println();
        /// Çözüm 4

        if (number / 2*2 == number) { // Bir sayıyı int olarak 2 ye bölüp sonra 2 ile çarpınca sonuç sayıya eşit oluyorsa
            System.out.println("Number is a EVEN number. ");

        }else {
            System.out.println("Number is a ODD number");
            System.out.println();
        }

    }
}
