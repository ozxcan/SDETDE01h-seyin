package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task33 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)



        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int toplam = 0;

        for (int i =1; i <sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i+ " ");
                System.out.println("Bölenine sahiptir.");
                toplam = toplam + i;
            }
        }
        System.out.println();
        if (toplam == sayi) System.out.println(sayi+" mükemmel Sayıdır.");
        else System.out.println(sayi+" mükemmel Sayı Değildir.");





    }


}
