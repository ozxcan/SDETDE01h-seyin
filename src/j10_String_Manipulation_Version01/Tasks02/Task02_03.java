package j10_String_Manipulation_Version01.Tasks02;

import java.util.Scanner;

public class Task02_03 {
    public static void main(String[] args) {
        // Verilen stringin , son karekterini '*' ile değiştirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scan.nextLine();

        if (str.length() > 0) {
            String str1 = str.substring(0, str.length()-1);
            str1 = str1.concat("*");
            System.out.println(str1);

        }else {
            System.out.println("String algılanamadı");
        }




    }
}
