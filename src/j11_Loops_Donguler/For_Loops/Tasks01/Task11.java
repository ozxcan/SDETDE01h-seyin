package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task11 {
    public static void main(String[] args) {

        /*
        A               //1. satıra 1 harf
        A B             //2. satıra 2 harf
        A B C           //3. satıra 3 harf
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */
        Character harfA;

        for (int i =0; i < 6; i++) {
            harfA = 65; // Buraya bunu yazdım ki her döngü başa geldiği zaman yeniden A 'dan başlasın diye. Yoksa alfabe sonuna kadar giderdi.
            for (int j =0; j<=i; j++) {
                System.out.print(harfA+ "  ");
                harfA++;

            }
            System.out.println();

        }

        // Cözüm 2

        for (int i =0; i < 6; i++) {

            for (int j =65; j<=65+i; j++) {
                System.out.print((char)j+ "  ");


            }
            System.out.println();

        }







   }
}
