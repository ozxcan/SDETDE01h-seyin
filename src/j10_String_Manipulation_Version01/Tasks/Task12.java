package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. "Haluk Bilgin Java" -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve soyadınızı giriniz = "); //Ahmet Emin Yilmaz
        String nameSurname = scan.nextLine().toUpperCase();


        /*Haluk Bilgin Java
         H : adAd2Soyad.CharAt(0);
         B : 1.boşluk karakterinin indexinin 1 fazlası
         J : Son boşluğun indexinin 1 fazlası */

        int ilkBosluk = nameSurname.indexOf(" ");
        int sonBosluk = nameSurname.lastIndexOf(" "); // bu soru özelinde bizde ikinci boşluk son boşluk olduğu için bulur.
        sonBosluk = nameSurname.indexOf(" ", ilkBosluk+1); // Bu da ilk boşluktan sonraki ilk boşluğu bulur.

        String ilkHarf = nameSurname.substring(0,1);
        String ikinciHarf = nameSurname.substring(ilkBosluk+1, ilkBosluk+2);
        String sonHarf = nameSurname.substring(sonBosluk+1, sonBosluk+2);

        System.out.println(ilkHarf + "."+ ikinciHarf + "." + sonHarf+".");





    }
}
