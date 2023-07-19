package j08_SwitchCase_Statement;

import java.util.Scanner;
import java.util.SortedMap;

public class C04_Exp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*  Task
        kullanıcıdan SDET kısaltmasındaki harflerden birini yazmasını isteyin.
        kullanıcı ;
        S girerse " SOFTWARE "
        D girerse " DEVELOPER "
        E girerse " ENGINEER "
        T girerse " TESTING " yazdırın.

         */

        System.out.print("Bir harf giriniz: ");
        String harf = scan.nextLine().toUpperCase();

        switch (harf) {
            case "S" :
                System.out.println("SOFTWARE");
                break;
            case "D" :
                System.out.println("DEVELOPER");
                break;
            case "E" :
                System.out.println("ENGINEER");
                break;
            case "T" :
                System.out.println("TESTING");
                break;
            default:
                System.out.println("Girdiğiniz harf geçersiz!");

        }





    }
}
