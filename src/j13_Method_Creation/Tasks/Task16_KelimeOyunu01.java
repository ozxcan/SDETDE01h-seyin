package j13_Method_Creation.Tasks;


import java.util.Scanner;


public class Task16_KelimeOyunu01 {
    //her metodda kullaancağım için aşağıdaki scan ve veriable'leri  classlevel'a aldım
    static int oyuncu = 1;//oyuncuyu önce 1 yani 1. oyuncu olarak başlangıç değeri ile atadım sonra oyuncu değiştireceğim zaman oyuncu=1 yerine oyuncu=2 atayacağım
    static int puan1 = 0;
    static int puan2 = 0;
    static String kelime = "";
    static String ekleme = "";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */

        System.out.print(oyuncu + ". oyuncu lutfen kelime giriniz :");//ilk oyunucudan oyuna başlama kelimesi istedim
        kelime = scan.next();//oyuncunun vediği kelimeyi class level'da hiçlik olarak ilk değerini verdiğim "kelime" değişkenine atadım

        // oyuncuyu degistirmek icin bir method yazmalıyız.

    }


}
