package j06_If_ElseIf_Else_Konular;

import java.util.Scanner;

public class C05_If_Else_Ornek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a != b) {
            if (a > b) {
                if (a > c) {
                    System.out.println("a en buyuktur");
                } else {
                    System.out.println("c en buyuktur");
                }
            } else {
                if (b > c) {
                    System.out.println("b en buyuktuır");
                } else {
                    System.out.println("c en buyuktur");
                }
            }

        } else {

        }

        System.out.println("bitti");



    }
}
