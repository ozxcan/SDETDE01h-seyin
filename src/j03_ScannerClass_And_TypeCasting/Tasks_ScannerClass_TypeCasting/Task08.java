package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci vize notunuzu giriniz:");
        float vize1 = scan.nextFloat();

        System.out.print("İkinci vize notunuzu giriniz:");
        float vize2 = scan.nextFloat();

        System.out.print("Final notunuzu giriniz:");
        float f = scan.nextFloat();

        float vizeOrt= (vize1+vize2)/2;
        float notOrt= vizeOrt*3/10+f*7/10;
        System.out.println("Not ortalamanız: " + notOrt);




    }
}
