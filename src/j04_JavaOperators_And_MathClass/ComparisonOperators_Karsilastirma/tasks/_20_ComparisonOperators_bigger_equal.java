package j04_JavaOperators_And_MathClass.ComparisonOperators_Karsilastirma.tasks;

public class _20_ComparisonOperators_bigger_equal {

    public static void main(String[] args) {

        /*  İki tane float oluşturun. Birinci float 14, ikinci float 17'dir.
            Birinci float'un, ikinci float'dan büyük eşit olduğunu veya  büyük olduğunu yada olmadığını doğrulayın.
            Sonucu yazdırınız. */

        //Kodu aşağıya yazınız.

        float a = 14; float b = 17;
        System.out.println(a>b);

        boolean ls = a >= b;
        boolean lm = a > b;
        boolean ln = a < b;

        System.out.println(ls);
        System.out.println(lm);
        System.out.println(ln);


    }
}
