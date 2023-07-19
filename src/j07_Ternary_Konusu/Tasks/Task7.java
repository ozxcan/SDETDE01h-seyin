package j07_Ternary_Konusu.Tasks;

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

        String numberString = (number % 2 == 0) ? "Number is a EVEN number" : "Number is a ODD number";
        System.out.println(numberString);
        System.out.println();
        System.out.println("**** Cozum 2 ****");
        System.out.println();

        String numberString2 = (number % 2 == 1)? "Number is a ODD number" : "Number is a EVEN number";
        System.out.println(numberString2);
        System.out.println();
        System.out.println("******* Çözüm 3 ********");
        System.out.println();

        String numberString3 = (number % 2 != 0) ? "Number is an ODD number" : "Number is an EVEN number";
        System.out.println(numberString3);



    }
}
