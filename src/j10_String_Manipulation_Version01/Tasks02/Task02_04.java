package j10_String_Manipulation_Version01.Tasks02;

import java.util.Scanner;

public class Task02_04 {
    public static void main(String[] args) {
        // "ad soyad" şeklinde string veriliyor,  soy ad içierisinde ki ilk
       // "e" harfinin indexini bulun

        Scanner scan = new Scanner(System.in);
        System.out.print("Ad ve Soyad giriniz: ");
        String str = scan.nextLine();

        int spaceIndex = str.indexOf(" ");
        int eIndex = str.indexOf("e", spaceIndex); // boşluktan sonra e yi bakar.
        System.out.println("e'nin Indexi : " + eIndex);

        // Cözüm
        int IndexE = str.lastIndexOf("e");
        System.out.println("E'nin Indexi : " + IndexE);





    }
}
