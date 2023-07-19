package j05_Ilk_Dort_Konu_Tekrar;

public class H10_Char_Study {

    public static void main(String[] args) {

        // SORU 1)
        System.out.println("***** CHAR *****");
        char a = '1';
        int b = a;


        System.out.println(a); // 1 - char herhangi bir dönüşüme ugramazda direk char karakteri yazdırırlır

        System.out.println(b); // 49 -  char int bir variable a esitlenirse ascıı ye göre deger alır
        System.out.println();

        // SORU 2)
        char c = 'A';

        System.out.println(c); // A - char herhangi bir dönüşüme ugramazda direk char karakteri yazdırırlır

        System.out.println(c+0);  // 65 - char matematiksel işleme girerse ascıı deki degerini alır

        System.out.println((int)c); // 65 - char int a cast olursa ascıı deki degerini alır

        System.out.println(c+2); // 67 - char matematiksel işleme girerse ascıı deki degerini alır

        System.out.println((char)(c+256)); // karakter// c --> char olarak A degerine sahiptir. 256 ile matematiksel işlmeme girer ve 256+65 işlmei olur .
        System.out.println();              // Bu sayısal sonuc en son (char) a döndürülür. Ve cıktı olarak karakter verir








    }

}
