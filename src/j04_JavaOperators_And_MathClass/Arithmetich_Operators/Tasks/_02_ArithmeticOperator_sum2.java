package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*   Verilen 4 tane int vardır.
        Int'lerin toplamlarını yazdırın  */
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int b = scan.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int c = scan.nextInt();

        System.out.print("Dördüncü sayıyı giriniz: ");
        int d = scan.nextInt();

        int sum = a+b+c+d;
        System.out.println(sum);







    }
}
