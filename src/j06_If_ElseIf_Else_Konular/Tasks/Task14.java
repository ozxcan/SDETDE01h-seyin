package j06_If_ElseIf_Else_Konular.Tasks;

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
