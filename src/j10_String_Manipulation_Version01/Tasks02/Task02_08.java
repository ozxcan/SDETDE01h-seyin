package j10_String_Manipulation_Version01.Tasks02;

import java.util.Scanner;

public class Task02_08 {
    public static void main(String[] args) {
        /*  TASK :
				StringMethods:
				girilen  bir strngin ikinci yarisini print eden code create ediniz
				uzunluk tek ise 2 ye bölünemez yazdırın
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :nbul

		 */

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir String giriniz: ");
        String str = sc.nextLine();

        if (str.length() % 2== 0) {
            System.out.println(str.substring(str.length()/2));

        }else {
            System.out.println("String ikiye bölünemez.");
        }


    }
}
