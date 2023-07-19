package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*Task->
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Üç basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();

        int birlerBasamak = sayi % 10;
        int onlarBasamak = (sayi % 100)/10;
        int yuzlerBasamak = sayi/100;
        System.out.println("Girdiğiniz sayının birler basamağı " + birlerBasamak + " onlar basamağı " + onlarBasamak + " yüzler basamağı " + yuzlerBasamak+ " \'dir.");



    }
}
