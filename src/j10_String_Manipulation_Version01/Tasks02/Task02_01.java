package j10_String_Manipulation_Version01.Tasks02;

import java.util.Scanner;

public class Task02_01 {
    public static void main(String[] args) {
        // verilen stringin 3. indexi varsa silin

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scan.nextLine();

        if ( str.length() <= 3) {
            System.out.println("String zaten 3 karakterden kısadır. " + str);

        }else {
            System.out.println(str.substring(0,3)+str.substring(4));
        }





    }
}
