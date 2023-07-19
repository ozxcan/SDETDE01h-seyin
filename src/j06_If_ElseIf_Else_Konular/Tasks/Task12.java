package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir karakter giriniz: ");

        char c = sc.next().charAt(0);

        if (Character.isAlphabetic(c)) {
            System.out.println("Karakter bir harftir.");

        }else {
            System.out.println("Harf değildir.");
        }



    }
}
