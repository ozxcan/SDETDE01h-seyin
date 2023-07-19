package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num1 = scan.nextInt();

        System.out.print("Bir sayı daha giriniz: ");
        int num2 = scan.nextInt();

        int kalan = num1 % num2;
        System.out.println("Kalan: " + kalan);




    }
}
