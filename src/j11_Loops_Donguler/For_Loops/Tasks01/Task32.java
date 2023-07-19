package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task32 {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        şeklipriint eden code create ediniz

         */

       // ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz


        int input= 5;

        for (int i =0 ; i < input ; i++) {
            for (int j =0 ; j<i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0 ; i<input; i++) {
            for (int j =0 ; j<input-i-2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
