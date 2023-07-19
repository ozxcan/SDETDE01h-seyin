package j10_String_Manipulation_Version01.Tasks02;

import java.util.Scanner;

public class Task02_07 {
    public static void main(String[] args) {
        // iki string veriliyor, birinci stringin 3. indeksini alın
        // bu karekter , ikinci stringde varsa oradan silin
        // input :  str1 = selamlar
        //          str2 = merhabalar
        // output   str2=  merhblr

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci stringi giriniz: ");
        String str = sc.nextLine();

        System.out.print("İkinci stringi giriniz: ");
        String str2 = sc.nextLine();

        String ucuncuKarakter = str.substring(3,4);

        if (str2.contains(ucuncuKarakter)) {
            System.out.println(str2.replace(ucuncuKarakter, ""));
        }else {
            System.out.println("Karakter bulunamadı");
        }

    }
}
