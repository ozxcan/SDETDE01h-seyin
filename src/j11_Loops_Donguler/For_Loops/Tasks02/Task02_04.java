package j11_Loops_Donguler.For_Loops.Tasks02;

public class Task02_04 {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen 10 adet sayının toplamını bulunuz

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int sayi = (int)(Math.random()*10+1);
            sum = sum + sayi;
            System.out.print(sayi + " ");


        }
        System.out.println();
        System.out.println("Sayıların toplamı " + sum);




    }
}
