package j13_Method_Creation;


import java.util.Scanner;

public class C03_Exp {
    public static void main(String[] args) {
        /*
        TASK >>>>>
        girilen 3 sayının ortalamsaını print eden METHOD yazınız.
         */


        System.out.println("Sayıların ortalaması =>" + ortalamaBul(1, 2, 3));


    }
    public static double ortalamaBul (int a, int b, int c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        a = sc.nextInt();

        b = sc.nextInt();

        c = sc.nextInt();

        double ortalama = (a + b + c) / 3.0;
        return ortalama;

    }
}
