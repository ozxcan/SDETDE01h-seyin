package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerleri icin 2 pozitif tamsayi giriniz");

        int baslangic= scan.nextInt();
        int bitis= scan.nextInt();

        int toplam = 0;
        for (int i = baslangic; i <= bitis; i++) {
            toplam += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Genel toplam ===> " + toplam);



    }
}
