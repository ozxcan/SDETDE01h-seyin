package j03_ScannerClass_And_TypeCasting;

public class C03_TypeCasting {
    public static void main(String[] args) {
        /* TypeCasting veri tipi dönüşümü demektir.
        byte < short < int < long < float < double < char < boolean < String
        şeklinde küçükten büyüğe doğru sıralanır.  */

        /* byte < short < int < long < float < double
    Auto Widening Casting -> Kucuk data type'larini buyuk data typlarina Java  otomatik olarak yapar.

            */
        //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
        //              byte < short < int < long < float < double
        //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
        //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir

//        int sayi = 1594556;
//        Integer sayi2 = sayi;
//        byte bb= (byte) sayi;
//        long ll = sayi;
//        float ff = sayi;
//
//        double dd = 986657455;
//        byte bb2 = (byte) dd;
//        System.out.println(bb2);
//
//        long aa = 87954565;
//        float cc = aa;
//        byte bb3 = (byte) aa;
//
//        int mmmm= 54884552;
//        double dbl = mmmm;
//        byte bb4 = (byte) mmmm;
//
//        int a3= 5;
//        bb  = (byte) a3;
//        String str = String.valueOf(a3);
//        System.out.println(str);
//        str="23";
//        a3 = Integer.parseInt(str);
//        System.out.println(a3);


        int x = 54867;
        byte y = (byte) x;
        System.out.println(y);

        byte a = 125;
        short b = a;
        System.out.println(b);

        short c =213;
        long ll= c;
        System.out.println(ll);

        double d = 1548785;
        byte bb = (byte) d;
        System.out.println(bb);

        String str = String.valueOf(c); // String.valueOf() methodu, daha önce string OLMAYAN bir sayı değerini string e dönüştürür.
        System.out.println(str);

        String k = "123";
        Integer z = Integer.parseInt (k); // Integer.parsenInt() methodu, string OLAN bir sayı değerini int yapar.
        System.out.println(z);





















    }



}
