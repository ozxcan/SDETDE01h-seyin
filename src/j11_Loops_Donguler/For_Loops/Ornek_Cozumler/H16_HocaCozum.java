package j11_Loops_Donguler.For_Loops.Ornek_Cozumler;

public class H16_HocaCozum {
    public static void main(String[] args) {
        /* verilen n sayısına göre aşağıdaki şekli oluşturun
         1
         2  3
         4  5  6
         7  8  9 10
        11 12 13 14 15

         */


        int n = 5;
        int sayac=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sayac = sayac +2;
                System.out.printf("%2d ", sayac);

            }
            System.out.print("\n");
        }

    }
}
