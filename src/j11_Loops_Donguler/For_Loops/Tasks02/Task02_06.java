package j11_Loops_Donguler.For_Loops.Tasks02;

import java.util.Scanner;

public class Task02_06 {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen n adet int sayıdan
        // tek olanların toplamını ekrana yazdıran program yazınız


        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı üretilsin: ");
        int n = scan.nextInt(); // burdaki en for döngüsü kaç kere dönecekse, yani kaç tane sayı üretilecekse onu belirtir.

        int tekToplam = 0;
        for (int i = 0; i < n; i++) {
            int sayi = (int) (Math.random() * 10+1); // Burdaki sayi değeri ise random olarak üretilen sayılardır.
            if (sayi % 2 != 0) {
                tekToplam += sayi;
                System.out.print(sayi + " ");
            }

        }
        System.out.println();
        System.out.println("Tek sayıların toplamı "+ tekToplam);

    }
}
