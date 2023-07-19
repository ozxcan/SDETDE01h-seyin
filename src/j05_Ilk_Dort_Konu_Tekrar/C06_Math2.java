package j05_Ilk_Dort_Konu_Tekrar;


import java.util.Scanner;

public class C06_Math2 {
    public static void main(String[] args) {

        //Task 8

        // verilen 3 double sayıdan ortanca olanı ekrana yaz.
        // önce en büyük değeri bul
        // sonra en küçük değeri bul
        // Toplamdan en büyük ve en küçük değeri çıkar, ortancayı bul.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        double z = scan.nextDouble();

        System.out.print("Bir sayı daha giriniz: ");
        double y = scan.nextDouble();

        System.out.print("Bir sayı daha giriniz: ");
        double w = scan.nextDouble();


//        double z = 8;
//        double y = 17;
//        double w = 22;


        double ortanca = (z+y+w) - (Math.max(z, Math.max(y, w))) - (Math.min (z, Math.min(y, w)));// Burda toplam - max değer- min değer
        System.out.println("Ortanca sayi: " + ortanca);                                            // ile ortanca sayıyı bulduk.


























    }
}
