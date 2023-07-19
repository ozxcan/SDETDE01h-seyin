package j09_Ilk_Sekiz_Ders_Degerlendirme;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* Klavyeden girilen ve 3 harften oluşan bir string i, her satıra bir harf gelecek şekilde yazdırınız
        Örnek input : ali,  (ipucu : String str="";  str.charAt)
         output
         a
         l
         i
          */

        Scanner scan = new Scanner(System.in);
        System.out.print("Üç harfli bir kelime giriniz: ");
        String str = scan.nextLine().toUpperCase();

        if (str.length() == 3) {
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(1));
            System.out.println(str.charAt(2));

        }else {
            System.out.println("Girdiğiniz kelime üç harfli değil.");
        }







    }
}
