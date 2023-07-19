package j10_String_Manipulation.Tasks;

import java.util.Scanner;

public class _03_StringMethods {
    public static void main(String[] args) {
        // ekrandan isim ve soy ismi tek boşluk ile okutunuz,
        // ve büyük harf kısaltma olarak yazınız
        // input "can taman"
        // output "C.T."

        Scanner scan = new Scanner(System.in);
        System.out.print("isim ve soy isim giriniz: ");
        String str1 = scan.nextLine().toUpperCase();

        char a = str1.charAt(0);
        char b = str1.charAt(str1.indexOf(" ")+1);
        System.out.println(a +"."+b+".");









    }
}
