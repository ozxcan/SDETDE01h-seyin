package j10_String_Manipulation_Version01.Tasks02;

import java.util.Scanner;

public class Task02_02 {
    public static void main(String[] args) {
        // Verilen stringin , ilk karekterini silin

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scan.nextLine();

        System.out.println(str.substring(1));

        // CÖZÜM 2

        str = str.substring(0,1).replaceFirst("\\S", "")+ str.substring(1);

        System.out.println(str);

    }
}
