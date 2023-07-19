package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task12_HocanınCozumu {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. "Haluk Bilgin Java" -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve soyadınızı giriniz = "); //Ahmet Emin Yilmaz
        String adAd2Soyad = scan.nextLine();


        /*Haluk Bilgin Java
         H : adAd2Soyad.CharAt(0);
         B : 1.boşluk karakterinin indexinin 1 fazlası
         J : Son boşluğun indexinin 1 fazlası */



        int indexBosluk1= adAd2Soyad.indexOf(" ");
        int indexBosluk2=adAd2Soyad.indexOf(" ",indexBosluk1+1);

        String str= adAd2Soyad.substring(0,1)+"."+adAd2Soyad.substring(indexBosluk1+1,indexBosluk1+2)+
                "."+adAd2Soyad.substring(indexBosluk2+1,indexBosluk2+2)+".";
        System.out.println(str);


    }
}
