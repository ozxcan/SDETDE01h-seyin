package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task17 {

    public static void main(String[] args) {

        /*
        task->  0 ile 100 arasındaki hem 5'e, hem de 4'e tam bölünebilen  sayıları print eden code create edinz.

         */

        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                if (i % 4 == 0) {
                    System.out.print(i + "  ");
                }
            }
        }


    }
}
