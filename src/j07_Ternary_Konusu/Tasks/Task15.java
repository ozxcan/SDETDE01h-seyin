package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz var mı? (E/H) ");
        String ehl = scan.nextLine().toUpperCase(); // burda hem string olarak girdiyi alıyorum, hem de ne olursa olsun
                                                    // girişi büyük harfe çeviriyorum.


        if (ehl.equals("E")) {

            System.out.print("Kaç yıl tecrübeniz var? "); // Bu sorguyu burada yaptım çünkü, ehliyeti varsa sorguya devam etsin istedim.
            int tec = scan.nextInt();                   //  Eğer ehliyeti yoksa başta, bu sorgulamaya hiç girmesin istedim.

            System.out.print("Şimdiye kadar kaç km mesafe aldınız? ");
            int km = scan.nextInt();

            if (tec >= 7) {
                if (km >= 100000) {
                    System.out.println("Tecrübeniz ve km mesafesi kontak anahtarı almanıza yeterlidir.");
                } else {
                    System.out.println("Tecrübeniz iyi ama km mesafesi kontak anahtarı için yeterli değildir." );
                }

            } else {
                if (km >= 100000) {
                    System.out.println("Km mesafesi yeterli ama tecrübeniz eksik olduğu için kontak anahtarını alamazsınız.");
                } else {
                    System.out.println("Hem tecrübeniz hem de mesafe eksiğiniz nedeniyle kontak anahtarı alamazsınız.");
                }

            }

        } else {
            if (ehl.equals("H")) {
                System.out.println("Bu iş için ehliyet gereklidir.");

            } else {
                System.out.println("Hatalı giriş.");
            }



        }

        System.out.print("Kaç yıl tecrübeniz var? "); // Bu sorguyu burada yaptım çünkü, ehliyeti varsa sorguya devam etsin istedim.
        int tec = scan.nextInt();                   //  Eğer ehliyeti yoksa başta, bu sorgulamaya hiç girmesin istedim.

        /* System.out.print("Şimdiye kadar kaç km mesafe aldınız? ");
        int km = scan.nextInt();

        String ehliyet = (ehl.equals("E")) ? (tec >= 7) ?((km >= 1000000) ? "Tecrübeniz ve km mesafesi kontak anahtarı almanıza yeterlidir.": "Tecrübeniz iyi ama km mesafesi kontak anahtarı almak için yeterli değildir.") :
                ((km >= 100000) ? "Km mesafesi yeterli ama tecrübeniz eksik" : "Hem tecrübeniz hem de km mesafesi eksiktir.") : (km >=100000) ? "Km mesafesi yeterli ama tecrübeniz eksik olduğu için kontak anahtarını alamazsınız":
                "Hem tecrübeniz hem de mesafe eksikliğiniz nedeniyle kontak anahtarı alamazsınız." : (ehl.equals("H")) ? "Bu iş için ehliyet gereklidir." : "Hatalı giriş yaptınız"; */


    }
}





















