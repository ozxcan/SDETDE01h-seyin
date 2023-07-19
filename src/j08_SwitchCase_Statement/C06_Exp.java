package j08_SwitchCase_Statement;

import java.util.Scanner;

public class C06_Exp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Task
        Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..
        345 --> ucyuzkırkbes
         */

        System.out.print("Uc basamakli bir sayı giriniz: ");
        int sayi = scan.nextInt();

        int birlerB = sayi % 10;
        int onlarB = (sayi % 100)/10;
        int yuzlerB = sayi / 100;

        String sonuc = " ";
        String sonuc2 = " ";
        String sonuc3 = " ";

        if (Integer.toString(sayi).length() == 3) {
            switch (yuzlerB) {
                case 1: sonuc = "yüz"; break;
                case 2: sonuc = "ikiyüz"; break;
                case 3: sonuc = "ücyüz";break;
                case 4: sonuc = "dörtyüz"; break;
                case 5: sonuc = "beşyüz"; break;
                case 6: sonuc = "altıyüz"; break;
                case 7: sonuc = "yediyüz"; break;
                case 8: sonuc = "sekizyüz"; break;
                case 9: sonuc= "dokuzyüz"; break;
                default:
                    System.out.println("Ilk rakam sifir olmamali.");
                    break;

            }switch (onlarB) {
                case 0: sonuc2 ="";break;
                case 1: sonuc2 = "on"; break;
                case 2: sonuc2 = "yirmi"; break;
                case 3: sonuc2 = "otuz"; break;
                case 4: sonuc2 = "kırk"; break;
                case 5: sonuc2 = "elli"; break;
                case 6: sonuc2 = "altmış"; break;
                case 7: sonuc2 = "yetmiş"; break;
                case 8: sonuc2 = "seksen"; break;
                case 9: sonuc2 = "doksan"; break;
                // default: sonuc2 = ""; break;
            }switch (birlerB) {
                case 0: sonuc3 = "";break;
                case 1: sonuc3 = "bir"; break;
                case 2: sonuc3 = "iki"; break;
                case 3: sonuc3 = "üç"; break;
                case 4: sonuc3 = "dört"; break;
                case 5: sonuc3 = "beş"; break;
                case 6: sonuc3 = "altı"; break;
                case 7: sonuc3 = "yedi"; break;
                case 8: sonuc3 = "sekiz"; break;
                case 9: sonuc3 = "dokuz"; break;
                //default:

            }
            System.out.println(sonuc+sonuc2+sonuc3);


        } else {
            System.out.println("Üç basamaklı bir sayı giriniz.");
        }













    }
}
