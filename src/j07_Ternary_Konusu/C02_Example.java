package j07_Ternary_Konusu;

import java.util.Scanner;

public class C02_Example {
    public static void main(String[] args) {

        // İki sayıdan küçük olanı ekrana yazdırın..

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter another number: ");
        int num2 = scan.nextInt();

        int sonuc = num1 < num2 ? num1 : num2; // num1 num2'den küçükse num1'i, değilse num2'yi yazdır dedik.
        System.out.println("Sonuc: " + sonuc);


    }
}
