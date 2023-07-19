package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        /*Task->
         * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
         * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Saniye olarak bir değer giriniz: ");
        int sn = scan.nextInt();

        int saat = sn / 3600;
        int kalanSaniye = sn % 3600;
        int dk = kalanSaniye / 60;
        int saniye = kalanSaniye % 60;
        System.out.println(sn + " saniye; " + saat + " saat, " + dk + " dakika, " + saniye + " saniye yapar.");













    }


}
