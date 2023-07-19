package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */
        Scanner input = new Scanner(System.in);

        System.out.print("agam cinsiyet  giresen E/K: ");
        char cns = input.next().charAt(0);

        System.out.print("Yasinizi giriniz : " );
        int yas = input.nextInt();

        System.out.print("Prim gününü girin: ");
        int prim = input.nextInt();

        // Ternary Ile Cözümü

//        String cns = cinsiyet.substring(0, 1).toUpperCase();
//        // üste cinsiyetin ilk karekterini büyük harfe cevirip altta "E" mi sorduk
//        // eğer çevirmeseydim bir altta yorumdaki gibi yapabilidim
//        // bu işlemler kullanıcı büyük harf veya küçük harf girdiğin de de çalışmalıdır.
//        //String sonuc = cns.equals("E") ||cns.equals("e") ? (yas >= 65 ? (primGunu >= 7000 ?
//
//        String sonuc = cns.equals("E") ? (yas >= 65 ? (primGunu >= 7000 ?
//                "emeklisiniz" : "Priminiz " + (7000 - primGunu) + " eksiktir")
//                : (primGunu >= 7000 ? "Prim gününüz dolmuş ama emeklilik için " + (65 - yas) + " yıl beklemelisiniz"
//                : "Priminiz " + (7000 - primGunu) + " gün eksik, " +
//                "ayrıca emklilik için " + (65 - yas) + " yıl beklemelisiniz"))
//                : (yas >= 60 ? (primGunu >= 6000 ?
//                "emeklisiniz" : "Priminiz " + (6000 - primGunu) + " eksiktir")
//                : (primGunu >= 6000 ? "Prim gününüz dolmuş ama emeklilik için " + (60 - yas) + " yıl beklemelisiniz"
//                : "Priminiz " + (6000 - primGunu) + " gün eksik, " +
//                "ayrıca emklilik için " + (60 - yas) + " yıl beklemelisiniz"));
//        System.out.println(sonuc);





        if (cns == 'K') {
            if ( yas >= 60) {
                if (prim >= 6000) {
                    System.out.println("Tebrikler, emekli oldunuz.");

                }else {
                    System.out.println("Emekli olmak için "+ (6000-prim)+ " gününe ihtiyacınız var.");

                }

            }else {
                if (prim >= 6000) {
                    System.out.println("Prim gününüz tamam. "+ (60 - yas) + " yıl yas için beklemeniz gerekir. ");

                }else {
                    System.out.println(6000-prim + " günü daha çalışmanız ve " + (60-yas) + " sene daha beklemeniz gerekir.");

                }

            }

        }else {       // cns == 'E' kısmını sorgular.
            if ( yas >= 65) {
                if ( prim >= 7000) {
                    System.out.println("Tebrikler, emekli oldunuz. ");

                } else {
                    System.out.println("Emekli olmak için " + (7000-prim) + " güne ihtiyacınız var.");

                }

            }else {
                if (prim >= 7000) {
                    System.out.println("Prim gününüz tamam. " + (65-yas) + " yıl beklemeniz gerekir. ");

                } else {
                    System.out.println(7000-prim + " günü daha çalışmanız ve " + (65-yas) + " yıl daha beklemeniz gerekir.");
                }
            }

        }






    }
}
