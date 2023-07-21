package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen e-mail ın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */

        String str = "ebıkGabık@gmail.com";
        password(str);


    }//main sonu
    public static void password (String password) {
        if ( password.contains("@")) {
            if (password.contains(".")) {
                if (!password.substring(0, 1).equals("@")) {
                    System.out.println("Email adresi geçerlidir.");
                }else System.out.println("Email @ ile başlayamaz.");
            }else System.out.println("Email '.' içermiyor.");
        }else System.out.println("Email @ içermiyor.");

    }



}
