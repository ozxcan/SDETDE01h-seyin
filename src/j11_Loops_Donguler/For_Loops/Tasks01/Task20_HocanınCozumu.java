package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task20_HocanınCozumu {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.
        int sayi;

        for (int i = 1; i <=5 ; i++) {
            sayi = i;
            for (int j = 1; j <=i ; j++) {
                System.out.print(sayi+" ");
                sayi = sayi+(5-j);
            }
            System.out.println();
        }


    }
}
