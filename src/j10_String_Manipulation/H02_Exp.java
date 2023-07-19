package j10_String_Manipulation;

import java.util.Scanner;

public class H02_Exp {

    public static void main(String[] args) {

        // ekrandan isim ve soy ismi tek boşluk ile okutunuz,
        // isim ve soy isimden uzun olan kaç karekterdir.
        // input : ali canoğlu
        // output  :7
        // boşluğu bul
        // ismin uzunluğu ( yani boşluktan önceki karekter sayusı, 1. int
        // soy isim uzunluğu ( yani boşluktan sonraki karekter sayısı, 2.int
        // 2 int den büyük olanı ekrana yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.print("İsim ve soyismi yazınız  :");
        String isim = scanner.next();
        int indexOfBosluk =isim.indexOf(" ");

        int lengtOfName = indexOfBosluk-0; // Boşluğa kadar olan kısım aynı zamanda ilk kelimenin uzunluğunu da bize verir.

        int lengtOfSurName = isim.length()-1-indexOfBosluk;
        if (lengtOfName>lengtOfSurName) System.out.println("İsim uzundur");
        else System.out.println("Soy isim uzundur");


    }
}
