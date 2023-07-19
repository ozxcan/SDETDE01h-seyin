package j10_String_Manipulation;

public class C12_StartWith_EndWith_Kullanimi {
    public static void main(String[] args) {

        /*
        startWith --->
        --> Bir dizenin belirtilen karakterlerle başlayıp başlamadığını kontrol eder.
        --> startWith içerisinde iki parametre varsa, verilen indeksin hangi değerle başladığını doğrular.
        --> Sonucu boolean döndürür.
         */

        String str = "Hüseyin";
        System.out.println(str.startsWith("H")); // String H ile başladığı için TRUE sonuc verir.
        System.out.println(str.startsWith("L")); // String L ile başlamadığı için FALSE verir.
        System.out.println(str.startsWith("h")); // String h ile başlamadığı için FALSE verir.
        System.out.println(str.startsWith("e",3)); // String'de 3. indeks e ile başladğı için TRUE verir.


        /* endsWith -->
        --> Bir dizenin belirtilen karakter (ler) ile bitip bitmediğini kontrol eder.
        --> Sonucu boolean olarak döndürür.
         */

        System.out.println(str.endsWith("n"));  // true
        System.out.println(str.endsWith("k"));   // false


    }
}
