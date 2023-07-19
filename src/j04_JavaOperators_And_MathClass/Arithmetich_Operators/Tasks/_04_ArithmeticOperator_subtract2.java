package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = scan.nextInt();

        System.out.print("Ücüncü sayıyı giriniz: ");
        int num3 = scan.nextInt();

        System.out.print("Dördüncü sayıyı giriniz: ");
        int num4 = scan.nextInt();

        int sonuc1 = num1 - num2 - num3 - num4;
        System.out.println("Sonuc: "+ sonuc1);

        int sonuc2 = num1 - num2;
        sonuc2 = Math.subtractExact(sonuc2, num3);
        sonuc2 = Math.subtractExact(sonuc2, num4);
        System.out.println("Sonuc: " + sonuc2);




    }
}
