package j06_If_ElseIf_Else_Konular;

import java.util.Scanner;

public class C02_If_Ornekler {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ali'nin yaşını giriniz: ");
        int alininYasi = scan.nextInt();

        System.out.print("Hasan'ın yaşını giriniz: ");
        int hasaninYasi = scan.nextInt();


        if (alininYasi > hasaninYasi) {
            System.out.println("Büyük olanın yasi " + alininYasi);
            System.out.println("Ali'nin yasi " + alininYasi);

        }  {
            System.out.println("Büyük olanın yasi " + hasaninYasi);
            System.out.println("Hasan'ın yasi " + hasaninYasi);
        /// Yukarıda Ali'nin büyük olması durumunda hem if içini hem de if dışında kalan son iki komut satırını yazar
        //// Ama Hasanın büyük olması durumunda, if içini yazmaz, sadece sondaki iki komut satırını yazdırır.
        }



    }
}