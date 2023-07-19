package j06_If_ElseIf_Else_Konular.Tasks;

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

        if (str1.equals(str2)) { /// Burda büyük küçük harfe duyarlı şekilde eşitleme yapar
            System.out.println("String 1 is equal to String 2");

        }
        else {
            System.out.println("String 1 is NOT equal to String 2");

        }
        if (str1.equalsIgnoreCase(str2)) { // Burda büyük küçük harfe duyarlı olmadan eşitleme yapar.
            System.out.println("String 1 is equal to String 2");

        }else {
            System.out.println("String 1 is NOT equal to String 2");
            System.out.println();

        }
        System.out.println("***** Eşit değilse diye nasıl çözeriz");

        if (!str1.equals(str2)) { /// ! ünlem işareti eşit değilmi diye sorar.
            System.out.println("String 1 is not equal to String 2");

        }
        else {
            System.out.println("String 1 is equal to String 2");

        }

    }
}
