package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        int a = scan.nextInt();

        System.out.print("Ikinci sayı: ");
        int b = scan.nextInt();

        System.out.print("Ücüncü sayı: ");
        int c = scan.nextInt();

        int sonuc = a * b * c;

        System.out.println(sonuc);


        






    }
}
