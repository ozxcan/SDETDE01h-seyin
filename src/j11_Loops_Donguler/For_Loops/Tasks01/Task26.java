package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz


        Scanner input = new Scanner(System.in);

        System.out.print(" bi sayi gir bakennn : ");
        int sayi = input.nextInt();

        String s1 = String.valueOf(sayi);
        int toplam = 0;
        for (int i =0; i < s1.length(); i++) {

            toplam = toplam+Integer.parseInt(s1.substring(i,i+1));


        }
        System.out.println("Rakamlar toplamı ==> " +toplam);

    }
}
