package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task38_HocanınCozumu {
    public static void main(String[] args) {
        /* aşağıdaki şekli oluşturunuz

              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
         */
        // n=5
        // i=0 iken boşluuk sayısı 8 adet ( 4 çift
        // i=1 iken boşluuk sayısı 6 adet ( 3 çift
        // i=2 iken boşluuk sayısı 4 adet ( 2 çift
        // i=3 iken boşluuk sayısı 2 adet
        // i=4 iken boşluuk sayısı 0 adet

        // n= 5,  8 boşluk  =  (n-i)*2-2
        // yıldız sayısı 1,3,5,7,9  = i*2+1
        int n=5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <((n-i)*2-2) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i*2+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // çift boşluk a göre çözüm
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <(i-1)*2+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
