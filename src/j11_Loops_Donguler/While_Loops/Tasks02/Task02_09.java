package j11_Loops_Donguler.While_Loops.Tasks02;

public class Task02_09 {
    public static void main(String[] args) {
        /*
        Verilen n sayısına göre aşağıdaki şekli oluşturunuz
        n=5;
        * * * * *
        * * * *
        * * *
        * *
        *

         */


        int n = 5;
        for ( int i =0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();




    }
}
