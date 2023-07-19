package j09_Ilk_Sekiz_Ders_Degerlendirme;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /* klavyeden sıra ile  1.sayı, işlem( +, -, *, / ) ve 2. sayı giriliyor ,
        işlemi yapıp ekrana yazdırınız (switch - case kullanılacak
        input
        3
        +
        5
        output 8

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int a = scan.nextInt();
        System.out.print("Bir işlem seçiniz ( +, -, *, / ): ");
        String b = scan.next();
        System.out.print("Bir sayı daha giriniz: ");
        int c = scan.nextInt();

        switch (b) {
            case "+" :
                System.out.println(a+c);
                break;
            case "-" :
                System.out.println(a-c);
                break;
            case "*" :
                System.out.println(a*c);
                break;
            case "/":
                System.out.println(a/c);
                break;
            default:
                System.out.println("Yanlış bir işlem seçtiniz! Yeniden deneyiniz.");
                break;
        }


    }
}
