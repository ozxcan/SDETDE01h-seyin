package j10_String_Manipulation_Version01.Tasks03_Regex_Kullanimi;

import java.util.Scanner;

public class Task03_03 {
    public static void main(String[] args) {
        /*
         -----> TASK
         Verilen String de kaç adet rakam vardır yazdırınız
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir String giriniz: ");
        String str = scan.nextLine();


        int withNumbers = str.replaceAll("\\D","").length(); // Burda rakam olmayan herhagi bir karakteri hiçlik yaptık.
        System.out.println("Girilen String'de " + (withNumbers)+ " adet rakam vardır.");








    }
}
