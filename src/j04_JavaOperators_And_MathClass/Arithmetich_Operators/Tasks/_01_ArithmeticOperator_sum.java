package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    Verilen iki tane int  (num1 , num2),
        Bu iki Integer'in toplamını yazdırın. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num1 = scan.nextInt();

        System.out.print("Bir sayı daha giriniz: ");
        int num2 = scan.nextInt();

        int sum = Integer.sum (num1, num2);
        System.out.println("Toplam: " + sum);





    }
}
