package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
      Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
      Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first text: ");
        String str1 = scan.nextLine();

        System.out.print("Please enter the second text: ");
        String str2 = scan.nextLine();

        String str3 = (str1.equals(str2))? "String 1 is equal to String 2" : "String 1 is NOT equal to String 2";
        System.out.println(str3);
        System.out.println();

        String str4 = (str1.equalsIgnoreCase(str2))? "String 1 is equal to String 2" : "String 1 is NOT equal to String 2";
        System.out.println(str4);



    }
}
