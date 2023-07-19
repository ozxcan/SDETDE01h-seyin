package j03_ScannerClass_And_TypeCasting;


import java.util.Scanner;

public class C01_ScannerClass_Int {

    public static void main(String[] args) {

        //Scanner Class kullanıcıdan veri almak için kulandığımız bir class'tır.
        //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" etmek gerekir.
        //Scanner Class'i Java nin util kutuphanesindedir.

        // kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.

        //  Scanner scan = new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obj.

        //  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
        //  System.out.print("adınızı giriniz :");

        //  // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
        //  String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

        //  System.out.println("isim = " + isim);

       Scanner scan = new Scanner(System.in); // Bunu .next methodu ile kullan.
       Scanner scanLine = new Scanner (System.in); // Bunu .nextLine() methodu ile kullan.
        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();
        n = n + 10;
        System.out.println("n = "+ n);

        System.out.print("Bir sayı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Bir sayı daha giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println("Büyük olan sayı: " + Integer.max(sayi1,sayi2));

        System.out.print("Lütfen adınızı giriniz: ");
        String ad = scanLine.nextLine();
        System.out.println("Isminiz: " + ad);


//        System.out.print("Bir sayı giriniz     : ");
//        int sayi1 = scan.nextInt();
////        System.out.print("Bir sayı daha giriniz: ");
////        int sayi2 = scan.nextInt();
////        System.out.println("Büyük sayı  "+Integer.max(sayi1,sayi2)+" dır");





    }
}
