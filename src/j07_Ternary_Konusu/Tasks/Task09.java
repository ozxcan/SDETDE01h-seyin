package j07_Ternary_Konusu.Tasks;

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

        String sonuc = (sayi > 0) ? "Sayi Pozitiftir." : (sayi < 0) ? "Sayi Negatiftir." : "Sayi ne pozitif ne de negatiftir.";
        System.out.println(sonuc);




    }
}
