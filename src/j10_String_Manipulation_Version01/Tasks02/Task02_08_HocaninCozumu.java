package j10_String_Manipulation_Version01.Tasks02;

public class Task02_08_HocaninCozumu {
    public static void main(String[] args) {
        /*  TASK :
				StringMethods:
				girilen  bir strngin ikinci yarisini print eden code create ediniz
				uzunluk tek ise 2 ye bölünemez yazdırın
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT: nbul

		 */

        String str  = "istanbul";
        if (str.length()%2==0) {
            System.out.println(str.substring(str.length()/2));
        } else System.out.println("yarıya bölünemez");


        // ek olarak tasks 10 - 15 arası 6 soruyu yapalım
    }
}
