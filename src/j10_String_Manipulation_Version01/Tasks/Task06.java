package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.nextLine();

        /*CÖZÜM
        sıfırdan sondan bir önceki indexe kadar yazdırırsak, son karakteri silmiş oluruz.
        */

        System.out.println(str.substring(0, str.length()-1));










    }
}
