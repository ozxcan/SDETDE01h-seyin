package j06_If_ElseIf_Else_Konular;

import java.util.Scanner;

public class H03_ifElse03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ali'nin yasini giriniz: ");
        int ali = sc.nextInt();

        System.out.print("Hasanin yasini giriniz: ");
        int hasan = sc.nextInt();

        if (ali > hasan) {
            System.out.println("(2)buyuk olan " + ali);
        }   {
            System.out.println("(2) buyuk olani " + hasan);
        }
    }
}
