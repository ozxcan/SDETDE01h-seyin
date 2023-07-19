package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */
        Scanner input = new Scanner(System.in);

        System.out.print("bir ad-soyad  giriniz : ");
        String name = input.nextLine().toUpperCase();

        int bosluk = name.indexOf(" ");
        String ad = name.substring(0, bosluk);
        String soyad = name.substring(bosluk+1);
        System.out.println(ad);
        System.out.println(soyad);




    }
}
