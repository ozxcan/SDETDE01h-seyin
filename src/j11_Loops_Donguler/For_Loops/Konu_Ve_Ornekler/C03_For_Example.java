package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

import java.util.Scanner;

public class C03_For_Example {
    public static void main(String[] args) {

        /*  -----> ÖRNEK
        n adet sayı veriliyor. Toplamını bulunuz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı toplanacak: ");

        int n1 = scan.nextInt(); // Burdaki n1 sayısı bize for döngüsünün kaç kere dönmesi gerektiğini belirtir.


        int sum = 0;
        for (int i=0; i < n1; i++) {
            System.out.print(i+1+ ". sayı? :"); // Burada ise girilecek n adet farkı sayıların kullancıdan girilmesi isteniyor.
            int sayi = scan.nextInt();

            sum = sum + sayi;
        }
        System.out.println("Toplam: " + sum);







    }









}
