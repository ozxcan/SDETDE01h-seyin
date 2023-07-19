package j09_Ilk_Sekiz_Ders_Degerlendirme;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /*
        "Bir web sitesi alışveriş sepet toplamı 500TL den fazla olan siparişler için kargo bedeli almıyor ,
        500 tl nin altı için 50 Tl kargo bedeli alıyor ama  alış veriş 450-500 arası ise 500 e tamamlanıyor
        Alış veriş bedeli girildiğinde, kargo dahil toplam ödenecek tutarı ekrana yazdıran proğram"
        Önnek input : 540 , output 540
        input 480 , output 500
        input 420 , output 470
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Aışveriş toplam miktarın giriniz: ");
        int sepet = scan.nextInt();

        if (sepet < 500) {
            if (sepet >= 450) {
                System.out.println("Kargo ücreti dahil toplam 500 TL");
            }else {
                System.out.println("Kargo ücreti dahil toplam " + (sepet + 50));
            }


        }else {
            System.out.println("Kargo ücreti dahil toplam "+sepet);
        }

    }
}
