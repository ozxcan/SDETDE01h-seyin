package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class _12_ArithmeticOperator_reminder2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında (num1 ve num2),
            num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.
            int sonuc'u yazdırınız.  */

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = scan.nextInt();

        int sonuc = num1 % num2;
        System.out.println("Sonuc: " + sonuc);











    }
}
