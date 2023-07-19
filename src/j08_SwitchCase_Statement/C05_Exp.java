package j08_SwitchCase_Statement;

import java.util.Scanner;
import java.util.SortedMap;

public class C05_Exp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Task
        kullanıcıdan gün ismi alıp , hafta içi veya haftasonu oldugunu yazdıralım.

         */

        System.out.print("Bir gün giriniz: ");
        String day = scan.nextLine();

        switch (day) {

            case "Pazartesi":

            case "Sali":

            case "Carsamba":

            case "Persembe":

            case "Cuma":
                System.out.println("Hafta içi");
                break;
            case "Cumartesi":

            case "Pazar":
                System.out.println("Hafta sonu");
                break;

            default:
                System.out.println("Yanlış yazdınız herhalde");

        }


    }
}
