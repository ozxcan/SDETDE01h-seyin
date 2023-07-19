package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        int num1 = scan.nextInt();

        System.out.print("Bir değer giriniz: ");
        int num2 = scan.nextInt();

        System.out.print("Bir değer giriniz: ");
        int num3 = scan.nextInt();

        System.out.print("Bir değer giriniz: ");
        int num4 = scan.nextInt();

        int result = num1 * num2 * num3 * num4;
        System.out.println("Sonucu: " + result);






    }
}
