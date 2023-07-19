package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task16_02_HocanınCozumu {
    public static void main(String[] args) {
/*     task->3 den 100 e kadar sayıların asal olanlarını listeleyiniz */


        for (int sayi = 3; sayi <100 ; sayi++) {
            boolean asalMi = true;
            for (int i = 2; i <sayi/2+1 ; i++) {
                if (sayi%i == 0) {
                    asalMi =false;
                }
            }
            if (asalMi) System.out.print(sayi+" ");

        }




    }
}
