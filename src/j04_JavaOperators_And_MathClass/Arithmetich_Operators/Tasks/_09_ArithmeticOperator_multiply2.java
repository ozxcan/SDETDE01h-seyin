package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        double a = scan.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double b = scan.nextDouble();

        System.out.print("Ücüncü sayıyı giriniz: ");
        double c = scan.nextDouble();

        System.out.print("Dördüncü sayıyı giriniz: ");
        double d = scan.nextDouble();


        double result = (a * b) * (c * d);
        System.out.println("Sonuc: "+ result);




    }
}
