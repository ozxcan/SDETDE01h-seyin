package j13_Method_Creation.Sorular;

import java.util.Scanner;
;

public class S14 {
    public static void main(String[] args) {
        /*
        Iki sayıdan büyük olanı bulan bir metot create edeniz.
        sayılar main metota okunacak, sonra büyükbul metot a gönderilip, büyük olan geri gönderilecek.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        int num1 = scan.nextInt();
        System.out.print("Ikinci sayı: ");
        int num2 = scan.nextInt();

        int eB = buyukBul(num1,num2);
        System.out.println("Büyük olan sayı "+eB);



    }
    public static int buyukBul (int a, int b) {
        int eB = Math.max(a,b);
        return eB;
    }
}
