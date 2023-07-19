package j07_Ternary_Konusu;

import java.util.Scanner;

public class C03_Example {
    public static void main(String[] args) {

        // 3 sayıdan küçük olanı tek ternary ile bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter another number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter another number: ");
        int num3 = scan.nextInt();

        // Yöntem 1

        int sonuc = (num1 < num2 && num1 < num3) ? num1 : (num2 < num1 && num2 < num3)? num2 : (num3);
        System.out.println(sonuc);
        System.out.println();

        // Yöntem 2

        int sonuc2 = num1<num2 ? (num1<num3 ? num1:num3 ) : (num2<num3 ? num2:num3);
        System.out.println("en kucuk = " + sonuc2);

        // Yöntem 3 Ternary içinde Math.min ile bulma

        int sonuc3 = num1 < num2 ? (Math.min(num1,num3)) : (Math.min(num2,num3)); // num1 < num2 ise , num1 ve num3 arasında küçük olanı seç true da.
        System.out.println("en kucuk = " + sonuc3);                          // num1 < num2 False ise, o zaman num2 ve num3 arasında min değeri seçer.
        System.out.println();

        // Yöntem 4 Math.min içinde Ternary ile bulma

        int sonuc4 = Math.min (num1 < num3 ? num1 : num3, num2);
        System.out.println("en kucuk = " + sonuc4);







    }
}
