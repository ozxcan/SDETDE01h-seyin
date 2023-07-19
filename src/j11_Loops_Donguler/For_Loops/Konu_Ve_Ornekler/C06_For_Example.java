package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

public class C06_For_Example {
    public static void main(String[] args) {
        /*  -----> ÖRNEK
        Rastgele üretilen (1 ile 100 arasında) 10 adet integer sayıdan; çift olanların ve
        tek olanların toplamını ayrı ayrı bulunuz.

         */

        int toplamCift = 0;
        int toplamTek = 0;
        int toplamTum=0;

        for (int i = 0; i < 10; i++) {

            int sayi = (int) (Math.random()*100+1);

            System.out.print(sayi + " ");
            toplamTum = toplamTum + sayi;
            if (sayi % 2 == 0) {

                toplamCift = toplamCift + sayi;
            } else {

                toplamTek = toplamTek + sayi;

            }


        }
        System.out.println();
        System.out.println("Çift Toplam ==> " + toplamCift );
        System.out.println("Tek Toplam ==> " + toplamTek );
        System.out.println("toplamTum = " + toplamTum);

    }
}
