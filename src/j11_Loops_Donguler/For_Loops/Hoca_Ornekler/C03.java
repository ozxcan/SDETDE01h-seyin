package j11_Loops_Donguler.For_Loops.Hoca_Ornekler;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        // 1 den n kadar sayıların toplamını bulunuz ( n dahil)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int n = scanner.nextInt();
        int toplam = 0;
        for (int i = 1; i <=n ; i++) {
            toplam +=i;  // toplam = toplam + i;

        }
        System.out.println("toplam = " + toplam);
    }
}
