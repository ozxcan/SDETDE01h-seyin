package j04_JavaOperators_And_MathClass.Arithmetich_Operators;

import java.util.Scanner;

public class Task_OndalikBasamakRakamlarToplami {
    public static void main(String[] args) {
        // kullanıcıdan alınan 3 basamaklı bir sayını rakamları toplamını print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı sayıyı yazınız : ");
        // % kullanırsak kalan ı verir    ,    / kullanırsak bölümü yani sonucu verir
        int sayi=scan.nextInt(); // 743
        int birlerBasamagi  = sayi%10; // Bu işlem kalanı verir.
        int onlarbasamagi   = (sayi%100)/10; // Bu işlem bölümü verir.
        int yuzlerBasamagi  = sayi/100; // Bu işlem bölümü verir.
        System.out.println("rakamlar toplamı : "+yuzlerBasamagi+onlarbasamagi+birlerBasamagi);
        System.out.println("rakamlar toplamı : "+(yuzlerBasamagi+onlarbasamagi+birlerBasamagi));
        System.out.println("Birler basamagi " + birlerBasamagi + " Onlar basamagi " + onlarbasamagi + " Yüzler basamagi " + yuzlerBasamagi);


    }
}
