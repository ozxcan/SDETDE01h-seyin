package j04_JavaOperators_And_MathClass.ComparisonOperators_Karsilastirma.tasks;

public class _15_ComparisonOperators_smaller {

    public static void main(String[] args) {

    /*    İki ayrı integer oluşturun.
            İlk integerin değeri 17,
            İkinci integerin değeri 20 olsun.
            Print kodunun içine, ilk int ikinci int'ten küçüktür yazın.(<,> simgeleri ile)
            Console'da true yazısını görmelisiniz. */

        // Kodu buraya yazınız.

        int a = 17; int b = 20;
        System.out.println(Integer.compare(a,b ) < 0);
        System.out.println(a<b);

    }
}