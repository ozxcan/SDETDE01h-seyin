package j10_String_Manipulation;

import java.util.Scanner;

public class C14_Example_Onemli {
    public static void main(String[] args) {

        /* TASK 02
        Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Dört harfli bir kelime giriniz: ");
        String kelime = scan.nextLine().toUpperCase();

        String ters = "";

        if (kelime.length() == 4) {
            for (int i = kelime.length()-1; i >=0; i--) {
                String c = kelime.substring(i,i+1);
                ters = ters + c;

            }
            System.out.println(ters);

        }else {
            System.out.println("Dört harfli bir kelime girmeniz gerekir.");
        }

        // Cözüm 2

        if (kelime.length() == 4) {kelime = kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println(kelime);

        }else{
            System.out.println("Dört harfli bir kelime girmeniz gerekir.");
        }






    }
}
