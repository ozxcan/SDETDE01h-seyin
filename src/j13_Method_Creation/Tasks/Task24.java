package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :1, 1, 2, 3, 5, 8, 13, 21, 34
       0,1,1,2,3,5,8
*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir n değer: ");
        int n = scan.nextInt();
        fibonacci(n);


    }
    public static void fibonacci(int n) {
        int ilkEleman=0;
        int ikinciEleman=1;
        System.out.print(ilkEleman+ " "+ikinciEleman+ " ");
        for (int i=2; i<n; i++) {
            int yeniSayi = ilkEleman+ikinciEleman;
            System.out.print(yeniSayi+" ");
            ilkEleman=ikinciEleman;
            ikinciEleman= yeniSayi;

        }
    }
}
