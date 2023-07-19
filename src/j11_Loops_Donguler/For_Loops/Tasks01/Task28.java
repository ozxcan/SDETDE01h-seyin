package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        // task-> girilen  bir char karakterden sonra gelen 10 karakteri prin eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz: ");
        char girilenKarakter=scan.next().charAt(0);

        int ch = girilenKarakter;

        for (int i= ch+1; i<=ch+10; i++) {
            System.out.print((char)(ch+i) + " ");
        }


    }
}
