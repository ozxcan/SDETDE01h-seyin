package j06_If_ElseIf_Else_Konular.Tasks;

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

        String str = String.valueOf(sayi);

        if (str.length() == 3) {
            System.out.println("3 Basamakli");

        }else if (str.length() == 2) {
            System.out.println("2 Basamakli");

        }else {
            System.out.println("İkisi de değil");

        }

        // ******** İKİNCİ YÖNTEM******

        if (sayi > 99 && sayi < 1000) {
            System.out.println("3 Basamakli");

        }else if (sayi >9 && sayi < 100) {
            System.out.println("2 Basamakli");

        }else {
            System.out.println("İkisi de değil");
        }




    }
}
