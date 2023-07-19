package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

public class C07_For_Example {
    public static void main(String[] args) {

        /*  -----> ÖRNEK
        Rastgele  1 ile 100 arasında 10 adet üretilen integer sayıdan; en büyüğünü bulan bir kod yazalım.

         */

        int enBuyuk = 0; // en büyük sayı değerini ilk başta sıfır olarak kabul ettim.
                    // yada Integer.MIN_VALUE ile en küçük değeri en büyük değer olarak kabul ederim.

        for (int i=0; i < 10; i++) {

            int rastgeleSayi = (int) (Math.random() * 100+1);
            System.out.print(rastgeleSayi + " "); // bu oluşturulan rastgele sayıları görmek için.

            if (rastgeleSayi > enBuyuk) {
                enBuyuk = rastgeleSayi;

            }
        }
        System.out.println();
        System.out.println("En büyük sayı ==> " + enBuyuk);




    }
}
