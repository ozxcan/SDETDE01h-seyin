package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
        Scanner input = new Scanner(System.in);

        System.out.print("bir metin   giriniz : ");
        String metin = input.nextLine();// javacanlara selam olsun güzel insanlar :)

//        System.out.println("metin.length() = " + metin.length());
//       System.out.println(metin.replaceAll("\\s", "").length());

        int space = metin.length() - (metin.replace(" ", "").length());
        int withSpace = metin.length();
        int withoutSpace = metin.replace(" ", "").length();

        System.out.println(space + " karakter boşluk var ");
        System.out.println("Boşluk ile birlikte uzunluğu " + withSpace);
        System.out.println("Boşluksuz metin uzunluğu " + withoutSpace);


    }
}
