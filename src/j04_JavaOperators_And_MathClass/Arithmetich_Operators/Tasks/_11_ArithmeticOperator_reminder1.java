package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */

        Scanner scan= new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        int num1 = scan.nextInt();

        System.out.print("Bir değer giriniz: ");
        int num2 = scan.nextInt();

        int result = num1 % num2;
        System.out.println("Sonuc: " + result);







    }
}
