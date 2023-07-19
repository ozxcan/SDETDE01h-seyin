package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında (num1,  num2),
        İlk int'i ikinci int'e bölün.
        Sonucu yazdırın. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num1 = scan.nextInt();

        System.out.println("Bir sayı giriniz: ");
        int num2 = scan.nextInt();

        int sonuc = num1 / num2;
        System.out.println("Sonuc: " + sonuc);



    }
}
