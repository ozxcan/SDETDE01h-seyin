package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task22 {

    public static void main(String[] args) {

        /* task-> 100'den 0'a kadar bütün tek sayıları print eden code create ediniz.
        99-98-97-96....
        100 ve 0 dahil değildir.*/

        for (int i = 100; i >=0; i--) {
            if ( i % 2 !=0) {
                System.out.print(i + " ");
            }
        }



    }
}
