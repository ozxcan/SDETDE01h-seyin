package j06_If_ElseIf_Else_Konular;

import java.util.Scanner;

public class C01_If_Statement {
    public static void main(String[] args) {

        // IF STATEMENT KULLANIMI

        int a = 12, b = 15;
        if (a == b) {
            System.out.println("Sayilar esittir");
        }
        System.out.println("program bitti.");


        //Örnek1

        // Ali ve Hasan'ın yaşları ekrana veriliyor. Büyük olanın yaşını ve adını ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Ali'nin yaşını giriniz: ");
        int alininYasi = scan.nextInt();

        System.out.print("Hasan'ın yaşını giriniz: ");
        int hasaninYasi = scan.nextInt();


        if (alininYasi > hasaninYasi) {
            System.out.println("Büyük olanın yasi " + alininYasi);
            System.out.println("Ali'nin yasi " + alininYasi);

        } else {
            System.out.println("Büyük olanın yasi " + hasaninYasi);
            System.out.println("Hasan'ın yasi " + hasaninYasi);
        }
        ////// Ya da else kısmını hiç yazmadan aşağıdaki kodu yaz

        System.out.println("Büyük olanın yasi " + hasaninYasi);
        System.out.println("Hasan'ın yasi " + hasaninYasi);



    }
}
