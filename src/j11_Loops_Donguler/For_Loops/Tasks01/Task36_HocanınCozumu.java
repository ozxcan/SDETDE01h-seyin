package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task36_HocanınCozumu {

    public static void main(String[] args) {
	//  Java ile girilen sayının harmonik serisini bulan program yazacağız.
    //  harmoni seri  = 1 + 1/2 + 1/3 + 1/4 + ...
        Scanner scan = new Scanner(System.in);


        System.out.print("n sayısını giriniz : ");
        int n=scan.nextInt();
        double sonuc=0;
        for (int i = 1; i <=n ; i++) {
            sonuc += 1.0/i;
        }
        System.out.println(sonuc);

    }
}
