package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task09_HocanınCozumu {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
				uzunluk tek ise 2 ye bölünemez yazdırın
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */
        Scanner input = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = input.nextLine();

        if (str.length() % 2 == 0) {
            System.out.println(str.substring(0,str.length()/2));
        } else {
            System.out.println("uzunluk 2 ye bölünemez");
        }



    }
}
