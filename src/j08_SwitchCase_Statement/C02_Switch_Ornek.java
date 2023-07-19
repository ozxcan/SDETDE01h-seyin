package j08_SwitchCase_Statement;

import java.util.Scanner;

public class C02_Switch_Ornek {
    public static void main(String[] args) {

        // Haftanın günü yazı ile verilor. Kaçıncı gün olduğunu yazdırın.
        // Input : pazartesi,
        // output : 1 şeklinde

        Scanner scan = new Scanner(System.in);
        System.out.print("Haftanın gününü giriniz: ");
        String hGun = scan.next().toUpperCase();
        int sayi = 0;


        switch (hGun) {

            case "PAZARTESI":
                sayi = 1;
                break;
            case "SALI":
                sayi = 2;
                break;
            case "ÇARŞAMBA":
                sayi = 3;
                break;
            case "PERŞEMBE":
                sayi = 4;
                break;
            case "CUMA":
                sayi = 5;
                break;
            case "CUMARTESİ":
                sayi = 6;
                break;
            case "PAZAR":
                sayi = 7;
                break;

            default:
                System.out.println("Hatalı gün");


        }
        System.out.println(sayi);


    }
}
