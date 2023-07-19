package j10_String_Manipulation_Version01.Tasks03_Regex_Kullanimi;

import java.util.Scanner;

public class Task03_01 {
    public static void main(String[] args) {
        // Verilen stringdeki rakam dışında kalan karekter sayısını bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir String giriniz: ");
        String str = scan.nextLine();

        int uzunlukTam = str.length();
        int withoutNumbers = str.replaceAll("\\d", "").length();

        System.out.println("Rakam dışında kalan karakter sayısı: " + withoutNumbers);


    }
}
