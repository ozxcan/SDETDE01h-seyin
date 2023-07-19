package j04_JavaOperators_And_MathClass.ComparisonOperators_Karsilastirma.tasks;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

    /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */



        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        double num1 = scan.nextDouble();
        System.out.print("İkinci sayı: ");
        double num2 = scan.nextDouble();

        boolean esit = num1==num2;
        System.out.println(esit);



    }
}
