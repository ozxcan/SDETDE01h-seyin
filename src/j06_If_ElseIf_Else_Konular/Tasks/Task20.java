package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class Task20 {
    /*
    etkinlik öneren program
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner (System.in);

        System.out.print("Sıcaklık Giriniz : ");
        heat=input.nextInt();

        if (heat >= 25 ) {
            System.out.println("Yüzme");

        }else if (heat >= 15) {
            System.out.println("Piknik");

        }else if (heat >= 5) {
            System.out.println("Sinema");

        }else {
            System.out.println("Kayak");

        }

    }
}
