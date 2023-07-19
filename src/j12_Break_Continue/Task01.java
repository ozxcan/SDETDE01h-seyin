package j12_Break_Continue;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını
        print eden code create ediniz.
        c yi bulunca çıksın
        */

        Scanner input = new Scanner(System.in);
        System.out.print("gakgom hele biseyler  giresen ha : ");
        String biSey = input.nextLine();
        int aSayisi = 0;

        int i = 0;
        while (i < biSey.length()) {

            if (biSey.charAt(i) == 'c') {
                break;
            }
            if (biSey.charAt(i) == 'a') {
                aSayisi++;
            }
            i++;
        }
        System.out.println("a karakter sayısı ==> " + aSayisi);




    }
}
