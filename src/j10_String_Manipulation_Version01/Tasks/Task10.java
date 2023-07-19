package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary/if
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */
        Scanner input = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String isim = input.nextLine();
        //if ile
        System.out.println("   ***   if statement   ***   ");

        if (isim.length() == 3) {
            if ((isim.charAt(0) != isim.charAt(1) && isim.charAt(0) != isim.charAt(2) && isim.charAt(1) != isim.charAt(2))) {
                System.out.println("Unique bir kelime girdiniz.");
            } else {
                System.out.println("İsim unique değil.");
            }


        } else {
            System.out.println("İsim üç harfli değildir.");
        }




    }
}