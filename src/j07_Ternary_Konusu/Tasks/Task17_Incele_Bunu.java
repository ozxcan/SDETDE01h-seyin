package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task17_Incele_Bunu {
    public static void main(String[] args) {
        /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Seçiminiz (T)aş / (K)ağıt / (M)akas ? : ");
        char secim = scan.next().toUpperCase().charAt(0);
        int bilSec = (int) (Math.random()*3);
        char bilSecim = ' ';
        if (bilSec==0) bilSecim='T';
        if (bilSec==1) bilSecim='K';
        if (bilSec==2) bilSecim='M';
        System.out.println("Bilgisayarın seçimi = "+bilSecim);

        if (secim=='T') {
            if (bilSecim=='T') System.out.println("Pat");
            if (bilSecim=='K') System.out.println("Bilgisayar kazandı");
            if (bilSecim=='M') System.out.println("Tebrikler kazandınız");

        } else {
            if ( secim == 'K') {
                if (bilSecim=='T') System.out.println("Tebrikler kazandınız");
                if (bilSecim=='K') System.out.println("Pat");
                if (bilSecim=='M') System.out.println("Bilgisayar kazandı");

            } else {
                if (secim == 'M') {
                    if (bilSecim=='T') System.out.println("Bilgisayar kazandı");
                    if (bilSecim=='K') System.out.println("Tebrikler kazandınız");
                    if (bilSecim=='M') System.out.println("Pat");
                } else System.out.println("Hatalı seçim");

            }
        }


    }
}
