package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task17_TasKagitMakasOyunu {
    public static void main(String[] args) {
        /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Seçiminizi giriniz (T)aş / (K)ağıt / (M)akas? : ");
        char secim = scan.next().toUpperCase().charAt(0);

        int bilSec = (int) (Math.random()*3); // Burda bilgisayar random olarak üç tane sayı seçsin 0,1,2 arasından dedik.
        char bilSecim = ' ';
        if (bilSec==0) bilSecim='T'; // Bilgisayarın seçtiği sayıları char değerine eşitledik. satır 15'e bak
        if (bilSec==1) bilSecim='K';
        if (bilSec==2) bilSecim='M';
        System.out.println("Bilgisayarın seçimi = "+bilSecim);

        if (secim=='T') { // Burda benim seçimim T olursa, bilgisayarın seçimine göre ihtimalleri değerlendirdik.
            if (bilSecim=='T') System.out.println("Pat");
            if (bilSecim=='K') System.out.println("Bilgisayar kazandı");
            if (bilSecim=='M') System.out.println("Tebrikler kazandınız");

        } else { /// Burda benim seçimim K olursa, bilgisayarın seçimine göre ihtimalleri değerlendirdik.
            if ( secim == 'K') {
                if (bilSecim=='T') System.out.println("Tebrikler kazandınız");
                if (bilSecim=='K') System.out.println("Pat");
                if (bilSecim=='M') System.out.println("Bilgisayar kazandı");

            } else { // Burda benim seçimim K olursa, bilgisayarın seçimine göre ihtimalleri değerlendirdik.
                if (secim == 'M') {
                    if (bilSecim=='T') System.out.println("Bilgisayar kazandı");
                    if (bilSecim=='K') System.out.println("Tebrikler kazandınız");
                    if (bilSecim=='M') System.out.println("Pat");
                } else System.out.println("Hatalı seçim");

            }
        }




    }
}
