package j06_If_ElseIf_Else_Konular;

import java.util.Scanner;

public class C04_IfElse_Ornek {
    public static void main(String[] args) {

        /// Ayşe ve Ece kardeştir ve yaşları veriliyor. Küçük kardeş hangisidir? Adını ve yaşını yazınız.
        /// Eğer ikiz iseler, ikizlerdir yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Aysenin yasisin giriniz: ");
        int yasAyse = scan.nextInt();

        System.out.print("Ecenin yasini giriniz: ");
        int yasEce = scan.nextInt();

        if (yasAyse > yasEce) {
            System.out.println("Küçük kardeşin adi Ece ve yasi " + yasEce);

        } else if (yasEce > yasAyse) {
            System.out.println("Küçük kardeşin adi Ayse ve yasi " + yasAyse);

        } else {
            System.out.println("Kardeşler ikizdir.");
        }
        System.out.println();
        System.out.println("****** İKİNCİ YÖNTEM******");

        /// yada ikinci yöntem

        if (yasEce == yasAyse) {
            System.out.println("Kardeşler ikizdir.");

        }
        else {
            if (yasEce > yasAyse) {
                System.out.println("Küçük kardeşin adi Ayse ve yasi " + yasAyse);

            } else {
                System.out.println("Küçük kardeşin adi Ece ve yasi " + yasEce);

            }

        }


    }
}
