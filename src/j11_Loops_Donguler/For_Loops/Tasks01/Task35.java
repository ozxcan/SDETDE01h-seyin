package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task35 {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........


        int sayi = 20;
        int oncekiSayi = 1;
        int ikiOncekiSayi = 0;
        System.out.print(ikiOncekiSayi + " " + oncekiSayi + " ");

        for (int i = 2; i < sayi; i++) {

            int yeniSayi = oncekiSayi + ikiOncekiSayi;
            System.out.print(yeniSayi + " ");
            ikiOncekiSayi = oncekiSayi;
            oncekiSayi = yeniSayi;


        }


    }
}