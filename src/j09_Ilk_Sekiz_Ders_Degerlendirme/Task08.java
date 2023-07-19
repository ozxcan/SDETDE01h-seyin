package j09_Ilk_Sekiz_Ders_Degerlendirme;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // verilen int bir sayının pozitif, yada negatif olma durumunu ekrana yazdıran bir code yazınız
        // ( if ve ternary kullanılmayacak, switch-case ile çözülecek ( ip ucu: Math.abs )
        // input : -12 , output: negatiftir
        // input :  32 , output: pozitiftir
        // (sıfır olma durumu göz artı edilmiştir)

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int num = scan.nextInt();



        switch (Integer.signum(num)) {
            case -1 :
                System.out.println("Sayi negatiftir.");
                break;
            case 1 :
                System.out.println("Sayi pozitiftir.");
                break;
            default:
                System.out.println("Sayı sifirdir.");
                break;
        }
        System.out.println("******");

        //Cözüm 2

        int c = num / Math.abs(num); // girilen num sayısı pozitif ise sonuc 1  negatif ise sonuc -1 olur burda.

        switch (c) {
            case -1 :
                System.out.println("Sayi negatiftir.");
                break;
            case 1 :
                System.out.println("Sayi pozitiftir.");
                break;
            default:
                System.out.println("Sayı sifirdir.");
                break;
        }





    }
}
