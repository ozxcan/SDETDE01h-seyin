package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class Task010 {
    public static void main(String[] args) {

        // Klavyeden okutulan 3 sayıdan en büyük olanı ekrana yazdır,
        // Eşitlik kontrolü yapmayın.

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = scan.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int b = scan.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int c = scan.nextInt();

        if (a > b && a > c ) {
            System.out.print("En büyük sayı " + a);

        }
        if (b > a && b > c) {
            System.out.print("En büyük sayı " + b);

        }
        if (c > a && c > b) {
            System.out.println("En büyük sayı " + c);
        }


    }
}
