package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task39_HocanınCozumu {
    public static void main(String[] args) {
        /* aşağıdaki şekli oluşturunuz

                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *
               * * *
               * * *
               * * *
               * * *
               * * *
         */
        int n=7;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <((n-i)*2-2) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i*2+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-2 ; j++) {
                System.out.print("  ");
            }
            System.out.println("* * *");

        }
        System.out.println();
    }
}
