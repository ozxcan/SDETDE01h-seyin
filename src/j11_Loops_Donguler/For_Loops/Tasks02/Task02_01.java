package j11_Loops_Donguler.For_Loops.Tasks02;

public class Task02_01 {
    public static void main(String[] args) {
        // 10 dan 20 ye kadar ( 10 ve 20 dahil) sayıların toplamını
        // for çevrimi ile bulan bir program yazınız

        int sum = 0;
        for (int i =10; i <= 20; i++) {
            sum +=i;
            System.out.println("i değeri = " + i);

        }
        System.out.println();
        System.out.print("Sayıların toplamı " + sum);





    }
}
