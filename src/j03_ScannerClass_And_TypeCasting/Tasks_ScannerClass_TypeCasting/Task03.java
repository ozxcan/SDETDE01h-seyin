package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Gunde kac saat uyuyorsunuz: ");
        int input = scan.nextInt();


        int ayda = (input*30)/24;
        int yilda = ayda *12;
        int kırkYılda = yilda*40;
        System.out.println("Günde " + input +" saatiniz,"+ " ayda " + ayda +" gününüz,"+ " yılda " + yilda +" gününüz,"+ " kırk yılda " + kırkYılda + " gününüz uykuda geciyor.");

    }
}
