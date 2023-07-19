package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

        /* Verilen 3 tane int (num1,num2,num3),
           Bu üç int'in toplamı yazdırın.   */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = scan.nextInt();

        System.out.print("Bir sayı daha giriniz: ");
        int b = scan.nextInt();

        System.out.print("Son bir sayı daha giriniz: ");
        int c = scan.nextInt();

        int sum = a + b + c;
        System.out.println(sum);

        int sum2 = Integer.sum (a, b);
        sum2 = Integer.sum(sum2, c);
        System.out.println(sum2);
        sum2 = Math.addExact(a, b);
        sum2 = Math.addExact(sum2, c);
        System.out.println(sum2);



    }
}
