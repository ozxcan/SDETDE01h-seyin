package j04_JavaOperators_And_MathClass.ComparisonOperators_Karsilastirma.tasks;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

        // Kodu aşağıya yazınız.

        Scanner dp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num1 = dp.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int num2 = dp.nextInt();

        boolean esit = num1 == num2;
        System.out.println(esit);



    }
}
