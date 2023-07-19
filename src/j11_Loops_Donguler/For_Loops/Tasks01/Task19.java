package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task19 {

    public static void main(String[] args) {

        /* task -> İlk 10 doğal sayının toplamını print eden code create ediniz.
         */
        int toplam = 0;
        for (int i = 0; i<10; i++) {
            toplam +=i;
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println("ilk 10 doğal sayının toplamı " + toplam );

    }
}
