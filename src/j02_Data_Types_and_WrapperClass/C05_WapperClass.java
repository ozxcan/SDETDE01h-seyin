package j02_Data_Types_and_WrapperClass;

public class C05_WapperClass {
    public static void main(String[] args) {
        /*
            Note: Java primitive lere method'lar ekleyerek yeni bir
                  yapi olusturdu, bu yapiya "Wrapper Class"
                  Primitive         Wrapper
                     byte     ==>    Byte
                     short    ==>    Short
                     ** int   ==>    Integer
                     long     ==>    Long
                     float    ==>    Float
                     double   ==>    Double
                     boolean  ==>    Boolean
                     ** char  ==>    Character
         */
        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve herhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data türünü, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.


        String str = "Hüseyin Almanya'da yaşıyor\n";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.getBytes());
        System.out.println(str.concat("Ali Almanya'da yaşıyor ")); // String.concat() ile eski stringin yerine başka bir string yazdırdık.
        System.out.println(str.repeat(3)); // Bu da bir stringi kaç kere tekrar etmek istediğini belirtmemizi sağlıyor.



        int s1 = 10;
        Integer s2 = 10;
        int s10 = s2;
        Integer s20 = s1;
        s10 = Integer.MIN_VALUE;
        s20 = Integer.MIN_VALUE;
        System.out.println(" in sayı üst limiti = "+Integer.MAX_VALUE);
        System.out.println(" in sayı alt limiti = "+Integer.MIN_VALUE);

        int sayi1 = 22;
        int sayi2  = 33;
        int sayi3  = 44;
        int kucuk = Integer.min(sayi1,sayi2);
        System.out.println("kucuk = " + kucuk);

        int toplam;

        toplam = sayi1+sayi2;
        System.out.println("toplam = " + toplam);

        toplam = Integer.sum(sayi1,sayi2);//Burda 3 farklı sayının toplamını Wapper ile bulduk.
        toplam = Integer.sum(sayi3,toplam);// Önce iki sayının toplamını bulup bir değere atadık.
        System.out.println("toplam = " + toplam); //Sonra bu değer ile üçüncü sayının toplamını bulduk

        char ch= 'A';
        System.out.println(Character.isDigit(ch)); // ch spesifik karakterin bir rakamsal değer mi olduğunu belirler.
        System.out.println(Character.isAlphabetic(ch)); // ch spesifik karakterinin bir alfabetik değer mi olduğunu belirler.
        System.out.println(Character.isLowerCase(ch)); // ch spesifik karakterini küçük harf ile belirtir.

////////////////////////////////////////////////////////////////
        int a = 115;
        int b = 325;
        int c = 410;
        int toplam6 = Integer.sum(a, b);
        toplam6 = Integer.sum(toplam6, c);
        System.out.println(toplam6);

        //Char Character metodu.


    }
}
