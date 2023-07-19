package j10_String_Manipulation;

public class C01_With_CharAT {
    public static void main(String[] args) {

        // String Manipulation, string in metodlarını kullanma demektir.
        // charAt() : Belirtilen bir indeksin karakter değeriri alır ve sonucu char olarak döndürür.

        String str = "Hello";
        char a = str.charAt(0); // "Hello" stringinin sıfırıncı indeksini (yani H) verir.
        char b = str.charAt(1); // "Hello" stringinin birinci indeksini (yani e) verir.
        char c = str.charAt(2); // "Hello" stringinin ikinci indeksini (yani l) verir.
        char d = str.charAt(3); // "Hello" stringinin üçüncü indeksini (yani l) verir.
        char e = str.charAt(4); // "Hello" stringinin dördüncü indeksini (yani o) verir.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);




    }
}
