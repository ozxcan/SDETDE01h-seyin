package j13_Method_Creation.Sorular;

public class S16 {
    public static void main(String[] args) {
        /*
        Bir kişinin not ortalaması(double) veriliyor.
        Başarı durumunu bir metotta hesaplayıp pirint ediniz.
        85 dahil ve üstü ise takdirname almaşıtır.
        75-84 dahil arası teşekkür almıştır.
        50-74 dahil başarılı
        50 altı başarısız

         */

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Not ortalamasını giriniz: ");
//        double ort = scan.nextInt();

        double not = Math.round((Math.random()*100));
        System.out.print("Üretilen not ==> " + not);
        System.out.println();

        System.out.println("******");
        ortalama(not);
        System.out.println();
        String sonuc = basariDurumu(not);
        System.out.println(sonuc);


    }
    public static void ortalama (double not) {

        if (not >=85 ) System.out.println("Takdırname almıştır.");
        else if (not >= 75) System.out.println("Teşekkür almıştır.");
        else if (not >= 50) System.out.println("Başarılıdır.");
        else System.out.println("Başarısızdır.");
    }
    public static String basariDurumu (double not) {
        String sonuc;
        if (not >=85 ) sonuc= "Takdırname almıştır.";
        else if (not >= 75) sonuc = "Teşekkür almıştır.";
        else if (not >= 50) sonuc= "Başarılıdır.";
        else sonuc= "Başarısızdır.";
        return sonuc;
    }



}
