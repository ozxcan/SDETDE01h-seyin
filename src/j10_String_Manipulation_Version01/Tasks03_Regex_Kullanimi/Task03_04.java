package j10_String_Manipulation_Version01.Tasks03_Regex_Kullanimi;

import java.util.Scanner;

public class Task03_04 {
    public static void main(String[] args) {

        /*
         -----> TASK
         verilen String de ki rakamlar haricindeki karekter sayısını yazdırınız
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir String giriniz: ");
        String str = scan.nextLine();

        int withoutNumbers = str.replaceAll("\\d", "").length();
        System.out.println("Rakamlar haricindeki karakter sayısı " + withoutNumbers);





    }
}
