package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
      /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("İnek sayısını giriniz: ");
        int inek = scan.nextInt();
        System.out.print("Tavuk sayısını giriniz: ");
        int tavuk = scan.nextInt();
        System.out.print("Koyun sayısını giriniz: ");
        int koyun = scan.nextInt();

        int inekAyak= inek * 4;
        System.out.println("İneklerin " + inekAyak + " adet ayağı vardır.");
        int tavukAyak= tavuk * 2;
        System.out.println("Tavukların " + tavukAyak + " adet ayağı vardır.");
        int koyunAyak = koyun * 4;
        System.out.println("Koyunların " + koyunAyak + " adet ayağı vardır.");




    }





}
