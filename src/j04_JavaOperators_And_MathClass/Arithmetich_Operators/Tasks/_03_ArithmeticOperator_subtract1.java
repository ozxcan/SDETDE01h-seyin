package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;


public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*    Verilen 2 tane int (num1, num2),
        Int'lerin farkını yazdırın. */

        Scanner scan = new Scanner (System.in);
        System.out.print("Bir tane sayı girin: ");
        int a = scan.nextInt();

        System.out.print("Bir tane daha sayı girin: ");
        int b = scan.nextInt();

        int c = a - b;
        System.out.println(c);





    }
}
