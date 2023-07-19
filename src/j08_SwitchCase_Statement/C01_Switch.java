package j08_SwitchCase_Statement;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {







        // Task
        // Verilen bir rakamı harf karakteri ile print eden code yazınız.
        // yani 1 yerine bir, 2 yerine iki gibi..
        // girdi 1, çıktı bir şeklinde olacak.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir rakam gir: ");
        int sayi = scan.nextInt();

        String sonuc = "-"; // Rakam girilmez ise ne olacak sorusu için string i bu şekilde tanımladım.
        if (sayi == 0) sonuc = "Sıfır";
        if (sayi == 1) sonuc = "Bir";
        if (sayi == 2) sonuc = "İki";
        if (sayi == 3) sonuc = "Üç";
        if (sayi == 4) sonuc = "Dört";
        if (sayi == 5) sonuc = "Beş";
        if (sayi == 6) sonuc = "Altı";
        if (sayi == 7) sonuc = "Yedi";
        if (sayi == 8) sonuc = "Sekiz";
        if (sayi == 9) sonuc = "Dokuz";
        System.out.println("İf ile sonuc "+sonuc);
        System.out.println();

        //  Switch Case ile yapılırsa
        switch (sayi) {
            case 0 : sonuc = "Sıfır"; break;  // Muhakkak case 'den sonra break yazmak lazım. Ya bir alta ya da yana yazabiliriz.
            case 1 : sonuc = "Bir"; break; // sayı 1 girilirse Bir çıktısı verecek
            case 2 : sonuc = "İki"; break;// sayı 2 girilirse İki çıktısı verecek...
            case 3 : sonuc = "Üç"; break;
            case 4 : sonuc = "Dört"; break;
            case 5 : sonuc = "Beş"; break;
            case 6 : sonuc = "Altı"; break;
            case 7 : sonuc = "Yedi"; break;
            case 8 : sonuc = "Sekiz"; break;
            case 9 : sonuc = "Dokuz"; break;
            default: sonuc = " -";



        }System.out.println("Switch ile sonuc " +sonuc);

















    }
}
