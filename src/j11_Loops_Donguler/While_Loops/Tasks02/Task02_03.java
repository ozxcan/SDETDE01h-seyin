package j11_Loops_Donguler.While_Loops.Tasks02;

public class Task02_03 {
    public static void main(String[] args) {
        // 1 den 50 ye kadar üçe bölünebilen sayıları büyükten küçüğe doğru ekrana yazdırın

        int i = 50;
        while (i >=4) {
            if (i % 3 == 0) {
                System.out.print(i + " > ");
            }
            i--;
        }
        System.out.print(i);
        System.out.println();
        System.out.println("---------------------");


        // do while ile

        i = 50;
        do {
            if (i % 3 == 0) {
                System.out.print(i + " > ");
            }
            i--;
        }while (i >= 4);
        System.out.print(i);

    }
}
