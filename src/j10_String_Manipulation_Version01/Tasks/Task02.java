package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner sc = new Scanner(System.in);
        System.out.print("password girişi yapınız : ");
        String password = sc.nextLine();

        if (password.length() >= 6) {
            if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
                if (password.charAt(password.length()-1) >= '0' && password.charAt(password.length()-1) <= '9') {
                    System.out.println("Tebrikler, güçlü bir şifre oluşturdunuz.");

                }else {
                    System.out.println("Şifrenizin son hanesi rakam olmalı.");
                }


            }else {
                System.out.println("İlk karakter büyük harf olmalıdır.");
            }

        }
        else {
            System.out.println("Şifre en az 6 karakter olmalı.");
        }






    }
}
