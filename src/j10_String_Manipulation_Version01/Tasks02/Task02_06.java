package j10_String_Manipulation_Version01.Tasks02;

import java.util.Scanner;

public class Task02_06 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakterin
         yerine '*' koyup print ediniz
         */


        Scanner scan = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = scan.nextLine();

        System.out.print("istenen karakterin index'ini giriniz : ");
        int index=scan.nextInt();

        if (index>=0 && index<str.length()) {
            String s1 = str.substring(0,index);
            String s2 = str.substring(index+1);
            System.out.println(s1.concat("*").concat(s2));
        }else {
            System.out.println("Veriler uygun değil");
        }








    }
}
