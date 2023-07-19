package j05_Ilk_Dort_Konu_Tekrar;

public class C05_Math {
    public static void main(String[] args) {

        /////Task7


        // verilen 3 double sayıdan büyük olanını, diğer ikisinin toplamından buyuk ise
        // ekran true, aksi halde ekrana false yazdırın
        // Mat class kullanılarak yapılacak

        double a  = 10;
        double b  = 15;
        double c  = 22;

        // Birinci yöntem
        double max = Math.max(a,b);
        double max1 = Math.max(max,c);
        double toplam = (a + b + c - max1); // max olmayan diğer iki sayının toplamını burdan buluruz.
        boolean ekran = max1 > toplam;
        System.out.println(max1);
        System.out.println(ekran);
        System.out.println();

        // İkinci yöntem

        double max3 = Math.max(a, Math.max(b,c));
        double toplam2 = (a+b+c) - max3;
        System.out.println(toplam2 > max3);
        System.out.println();

        // örnek
        double d = 10;
        double e = 15;
        double f = 26;
        double g = 29;

        double result0= Math.max(d ,  Math.max(e ,  Math.max(f ,  g))); // böyle iç içe yazmakla tek seferde en büyük değeri buluruz.
        System.out.println(result0);
        System.out.println();





    }
}
