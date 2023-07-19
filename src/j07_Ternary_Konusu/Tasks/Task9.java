package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // Str bir String'dir.
        // Eğer String Orange'ye eşitse ve uzunluğu 6 karakter ise
        // "Orange has six letters" yazdır.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir String giriniz: ");
        String str = scan.nextLine();

        if (str.equals("Orange") && str.length()==6) {
            System.out.println("Orange has six letters");
        }
        //// Ternary Çözümü

        String s2 = (str.equals("Orange") && str.length() == 6) ? "Orange has six letters" : "Not important";
        System.out.println(s2);





    }
}
