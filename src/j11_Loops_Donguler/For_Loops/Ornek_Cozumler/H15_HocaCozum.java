package j11_Loops_Donguler.For_Loops.Ornek_Cozumler;

public class H15_HocaCozum {
    public static void main(String[] args) {
        /* verilen n sayısına göre aşağıdaki şekli oluşturun
        *
        * *
        * * *
        * * * *
        * * * * *

        1. tur i = 0 , j=0 1<1 e kadar
        2. tur i = 1 iken j=0 dan <2
        3. tur i = 2 iken j=0 dan <3
        3. tur i = 3 iken j=0 dan <4
        3. tur i = 4 iken j=0 dan <5


        * */


        int n = 5;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.printf("%s ","*");
            }
            System.out.print("\n");
        }


        /* verilen n sayısına göre aşağıdaki şekli oluşturun
             *
           * *
         * * *

        */

        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <= n; j++) {
                if ( j>=i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }



    }
}
