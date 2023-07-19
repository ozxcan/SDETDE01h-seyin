package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();


        if (text.indexOf(" ") != -1) {
            System.out.println("Boşluk vardır.");

        }else {
            System.out.println("Boşluk yoktur.");
        }

        // İKİNCİ YÖNTEM

        if (text.contains(" ")) {
            System.out.println("Boşluk vardır.");
        }else {
            System.out.println("Boşluk yoktur.");
        }

        // ÜÇÜNCÜ YÖNTEM

        int i1 = text.replace(" ","").length();
        int i2 = text.length();

        if (i1 != i2) {
            System.out.println("Boşluk vardır.");

        }else {
            System.out.println("Boşluk yoktur.");
        }







    }
}

