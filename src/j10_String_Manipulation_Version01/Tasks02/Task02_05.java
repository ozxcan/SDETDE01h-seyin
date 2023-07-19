package j10_String_Manipulation_Version01.Tasks02;

import java.util.Scanner;

public class Task02_05 {
    public static void main(String[] args) {
        // Verilen bir ismi "Tarık Can" T**** C** şeklinde yazdır.

        Scanner scan = new Scanner(System.in);
        System.out.print("Ad ve Soyad giriniz: ");
        String nameSurname = scan.nextLine();

        int space = nameSurname.indexOf(" ");

        String name = nameSurname.substring(0, 1) + nameSurname.substring(1,space).replaceAll("\\S", "*");
        String surname = nameSurname.substring(space,space+2)+nameSurname.substring(space+2).replaceAll("\\S", "*");
        System.out.println(name + surname);






    }
}
