package j07_Ternary_Konusu;

import java.util.Scanner;

public class C07_Example {
    public static void main(String[] args) {
        /*
    etkinlik öneren program
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

     */

        Scanner scan = new Scanner (System.in);

        System.out.print("Sıcaklık Giriniz : ");
        int heat =scan.nextInt();

        String sonuc = (heat >= 25) ? "Yüzme" : ((heat >= 15) ? "Piknik" : ((heat >= 5) ? "Sinema" : "Kayak"));
        System.out.println(sonuc);


    }
}
