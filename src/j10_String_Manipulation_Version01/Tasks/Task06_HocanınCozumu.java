package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task06_HocanınCozumu {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.nextLine();
        // input : "alamanya"
        // output: "alamany"
        int sonIndex = str.length()-1;
        str = str.substring(0,sonIndex);
        System.out.println("yeni str = "+str);

    }
}
