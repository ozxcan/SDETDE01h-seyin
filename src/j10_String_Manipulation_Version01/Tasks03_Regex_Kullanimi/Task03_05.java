package j10_String_Manipulation_Version01.Tasks03_Regex_Kullanimi;

import java.util.Scanner;

public class Task03_05 {
    public static void main(String[] args) {


        /*
         -----> TASK
         Verilen String teki tüm boşlukları , regex kullanarak yıldıza çeviriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir String giriniz: ");
        String str = scan.nextLine();


        String newStr = str.replaceAll("\\s","*");
        System.out.println("Yeni yıldızlı String ====> " + newStr);


    }
}
