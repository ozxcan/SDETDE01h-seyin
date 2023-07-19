package j10_String_Manipulation;

public class C08_Exp_ReplaceAll {
    public static void main(String[] args) {

        /*
        .replace() ile örnekler:

        Örnek: Verilen stringde ki "al" geçen ifadeleri kaldırınız.
         */

        String str = "selamlar alı al kardeş";
        str = str.replace("al","");
        System.out.println(str);

        /* ORNEK:
        Verilen Stringde Ali yerine yanlışlıkla alı yazılmıştır. Bunu düzeltin.

         */

        String a = "selamlar alı al karalı";

        a = a.replace(" alı ", " Ali ");
        System.out.println(a);

        /*
        ORNEK :

         */






    }
}
