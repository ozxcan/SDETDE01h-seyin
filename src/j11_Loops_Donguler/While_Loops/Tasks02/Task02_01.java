package j11_Loops_Donguler.While_Loops.Tasks02;

import java.util.Scanner;

public class Task02_01 {
    public static void main(String[] args) {
        // verilen n sayısından 1 e kadar ekrana yan yana yazdırın,

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir n değeri giriniz: ");
        int n = scan.nextInt();

        while (n>=1) {

            System.out.print(n+ " ");
            n--;
        }
        System.out.println();

        // do while ile yapalım

        System.out.print("Bir n1 değeri giriniz: ");
        int n1 = scan.nextInt();


        do {
            System.out.print(n1+ " ");
            n1--;
        }while (n1>=1);


    }

}
