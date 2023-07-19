package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        */
        Character c = 65;
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(c+ "  ");

            }

            System.out.println();
            c++;

        }
        // ÇÖZÜM 2

        for (int i =0; i < 6; i++) {

            for (int j =0; j<=i; j++) {
                System.out.print((char)(65+i)+ "  ");


            }
            System.out.println();

        }










    }
}
