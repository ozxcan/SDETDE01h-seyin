package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir sayi gir : ");
        int sayi = sc.nextInt();

        if ( sayi > 0 ) System.out.println("sayi pozitiftir.");
        if (sayi < 0 ) System.out.println("sayi negatiftir.");
        if (sayi == 0 ) System.out.println("Sayi ne pozitif ne de negatiftir.");



    }
}
