package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        int sayi = scan.nextInt();

        String str = String.valueOf(sayi); // Burda sayi int değerini string değerine casting yaptık.

        String s1 = (str.length() == 3) ? "3 Basamakli" : ((str.length() == 2) ? "2 Basamakli" : "İkisi de değil");
        System.out.println(s1);
        System.out.println( );

        System.out.println("****** İKİNCİ YÖNTEM*****");

        System.out.println();
        String s2 = (sayi > 99 && sayi < 1000) ? "3 Basamakli" : ((sayi > 9 && sayi < 100) ? "2 Basamakli" : "Ikisi de değil");
        System.out.println(s2);






    }
}
