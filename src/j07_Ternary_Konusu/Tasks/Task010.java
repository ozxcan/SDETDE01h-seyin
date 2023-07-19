package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task010 {
    public static void main(String[] args) {

        // Klavyeden okutulan 3 sayıdan en büyük olanı ekrana yazdır,
        // Eşitlik kontrolü yapmayın.

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int b = scan.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int c = scan.nextInt();

//        if (a > b && a > c ) {
//            System.out.print("En büyük sayı " + a);
//
//        }
//        if (b > a && b > c) {
//            System.out.print("En büyük sayı " + b);
//
//        }
//        if (c > a && c > b) {
//            System.out.println("En büyük sayı " + c);
//        }

        // Ternary Cözümü

        String ss = (a > b && a > c) ? "En büyük sayı " + a : ((b > a && b > c) ? "En büyük sayı " + b : "En büyük sayı " + c);
        System.out.println(ss);


    }
}
