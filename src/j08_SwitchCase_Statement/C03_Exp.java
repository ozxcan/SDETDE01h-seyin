package j08_SwitchCase_Statement;

import java.util.Scanner;

public class C03_Exp {
    public static void main(String[] args) {

        /* Kullanıcıdan bir sayı girmesini isteyin.
                girilen sayı
        10 ise " iki basamakli en kucuk sayi "
        100 ise " uc basamakli en kucuk sayi "
        1000 ise " dort basamakli en kucuk sayi "
        diğer durumlarda " girdiğin sayıyı degiştir " yazdırın */

        Scanner scan = new Scanner (System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        switch (sayi) {
            case 10 :
                System.out.println("İki basamakli en kucuk sayı");
                break;
            case 100 :
                System.out.println("Uc basamakli en kucuk sayı");
                break;
            case 1000 :
                System.out.println("Dort basamakli en kucuk sayı");
                break;

            default:
                System.out.println("Hatalı sayı girdiniz. ");

        }



    }
}
