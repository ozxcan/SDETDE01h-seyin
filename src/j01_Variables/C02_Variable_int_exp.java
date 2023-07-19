package j01_Variables;

public class C02_Variable_int_exp {
    public static void main(String[] args) {
        //             I am learning Java and Python
        System.out.println("Hello");
        System.out.println("\"Hello \",");
        System.out.println("\"Hello \",");
        System.out.println("  \"\"\"HHH\"\"\"   "); //Ekranda " gözükmesi için önüne \ koymamız lazım.
        System.out.println("\"Hello \", \"World  \\ /\"");

        //VARIABLE, Değişkenleri nasıl kullanırız.
        // Değişkenler mutlaka önceden tanımlanmalıdır.
        // Bir değişken aynı main fonksiyonu içerisinde bir kez tanımlanmış ise ikince kez tanımlamaya gerek yoktur.


        int c = 10;
        int d;
        int toplam = 0;
        toplam = toplam + c;
        System.out.println("Sayı: " + c);
        System.out.println("Toplam = " + toplam);


        int a = 29;
        int b = 62;
        int toplam1 = a + b;

        System.out.println("Toplam: " +toplam1);


        int sayi1 = 11;
        int sayi2 = 22;
        sayi1 = sayi1 + sayi2;
        System.out.println("Sayı1 + sayı2 = "+ sayi1);



    }
}
