package j11_Loops_Donguler.While_Loops.Tasks02;

public class Task02_02 {

    public static void main(String[] args) {
         /*
        1 den 50 ye kadar üçe bölünebilen sayıları ekrana yazdırın,
        */

        int i = 1;
        while (i <50) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("---------------------");


        // do while ile

        i = 1;
        do {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }while (i < 50);

    }


}
