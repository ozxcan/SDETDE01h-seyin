package j02_Data_Types_and_WrapperClass.Tasks;

public class Task03_WapperClassExp_MaxMinValue {
    // Tüm sorular Wapper Class kullanılarak çözülmelidir.
    // if, ternary , + , ifadeleri kullanılamyacak
    // Task01 : float, double, byte, short ve int'in maximum ve minimum degerlerini print eden code create ediniz.
    // Task02 : verilen 3 sayıdan en buyuk olanını , wapper class yöntemi ile bulan bir code yazınız

    // Task04 : Verilen 3 sayıdan, en küçüğü ile en büyüyünün toplamını bulan program yazınız
    // Task05 : verilen 2 sayının farkını bulun sonuç 0 dan büyük olsun
    //
    public static void main(String[] args) {

        //Task01 : float, double, byte, short ve int'in maximum ve minimum degerlerini print eden code create ediniz.

        float a = Float.MAX_VALUE;
        float b = Float.MIN_VALUE;
        System.out.println(a);
        System.out.println(b);
        System.out.println();//Boş satır olsun diye yaptım

        double c = Double.MAX_VALUE;
        double d = Double.MIN_VALUE;
        System.out.println(c);
        System.out.println(d);
        System.out.println();

        byte e = Byte.MAX_VALUE;
        byte f = Byte.MIN_VALUE;
        System.out.println(e);
        System.out.println(f);
        System.out.println();

        short g = Short.MAX_VALUE;
        short h = Short.MIN_VALUE;
        System.out.println(g);
        System.out.println(h);
        System.out.println();

        int i = Integer.MAX_VALUE;
        int k = Integer.MIN_VALUE;
        System.out.println(i);
        System.out.println(k);
        System.out.println();
        //Task02 : verilen 3 sayıdan en buyuk olanını , wapper class yöntemi ile bulan bir code yazınız

        int s1 = 112;
        int s2 = 259;
        int s3= 39;
        int eB= Integer.max(s1,s2);
        eB = Integer.max(eB,s3);
        System.out.println(eB);
        System.out.println();

        //// Task04 : Verilen 3 sayıdan, en küçüğü ile en büyüyünün toplamını bulan program yazınız

        int a1 = 65;
        int a2 = 95;
        int a3 = 51;
        int EB = Integer.max(a1,a2);
        EB = Integer.max(EB,a3);
        int EK = Integer.min(a1,a2);
        EK = Integer.min(EK,a3);
        int toplam = Integer.sum(EB,EK);
        System.out.println(toplam);
        System.out.println();

        //// Task05 : verilen 2 sayının farkını bulun sonuç 0 dan büyük olsun

        int x= 202;
        int y= 63;
        int B= Integer.max(x,y);
        int K= Integer.min(x,y);
        int sonuc= B-K;
        System.out.println(sonuc);









    }
}
